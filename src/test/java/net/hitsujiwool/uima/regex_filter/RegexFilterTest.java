package net.hitsujiwool.uima.regex_filter;

import net.hitsujiwool.uima.regex_filter.types.ExampleType;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.metadata.TypeSystemDescription;
import org.junit.Assert;
import org.junit.Test;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.TypeSystemDescriptionFactory;
import org.apache.uima.fit.util.JCasUtil;

public class RegexFilterTest {

  private JCas jCas;

  private ExampleType annoSheep;

  private ExampleType annoGoat;

  private void runEngine(Object[] params) throws Exception {
    TypeSystemDescription tsd = TypeSystemDescriptionFactory.createTypeSystemDescription("net.hitsujiwool.uima.regex_filter.types.ExampleTypeSystem");
    AnalysisEngine ae = AnalysisEngineFactory.createPrimitive(RegexFilter.class, tsd, params);

    this.jCas = ae.newJCas();
    this.jCas.setDocumentText("baaaa! bleat!");

    ExampleType annoSheep = new ExampleType(this.jCas);
    annoSheep.setFoo("baaaa");
    annoSheep.setBegin(0);
    annoSheep.setEnd(6);
    annoSheep.addToIndexes();
    this.annoSheep = annoSheep;

    ExampleType annoGoat = new ExampleType(this.jCas);
    annoGoat.setFoo("bleat");
    annoGoat.addToIndexes();
    annoGoat.setBegin(7);
    annoGoat.setEnd(13);
    this.annoGoat = annoGoat;

    ae.process(this.jCas);
  }

  /**
   * Filter the value of anno.coveredText() by given pattern.
   * Matched annotation remains.
   *
   * @throws Exception
   */

  @Test
  public void matchedAnnotaionRemains() throws Exception {
    Object[] params = new Object[] { "FilterOut", false, "Pattern", "baaaa!", "Type", "net.hitsujiwool.uima.regex_filter.types.ExampleType" };

    this.runEngine(params);

    Assert.assertTrue(JCasUtil.select(this.jCas, ExampleType.class).contains(this.annoSheep));
  }

  /**
   * Filter the value of anno.coveredText() by given pattern.
   * Unmatched annotation is removed from index.
   *
   * @throws Exception
   */

  @Test
  public void unmatchedAnnotationIsRemoved() throws Exception {
    Object[] params = new Object[] { "FilterOut", false, "Pattern", "baaaa!", "Type", "net.hitsujiwool.uima.regex_filter.types.ExampleType" };

    this.runEngine(params);

    Assert.assertFalse(JCasUtil.select(this.jCas, ExampleType.class).contains(this.annoGoat));
  }

  /**
   * Filter the value of anno.coveredText() by given pattern.
   * In case of configuration params "FilterOut" is flagged true, Matched annotation is removed.
   *
   * @throws Exception
   */

  @Test
  public void matchedAnnotaionIsRemoved() throws Exception {
    Object[] params = new Object[] { "FilterOut", true, "Pattern", "baaaa!", "Type", "net.hitsujiwool.uima.regex_filter.types.ExampleType" };

    this.runEngine(params);

    Assert.assertFalse(JCasUtil.select(this.jCas, ExampleType.class).contains(this.annoSheep));
  }

  /**
   * Filter the value of anno.coveredText() by given pattern.
   * In case of configuration params "FilterOut" is flagged true, Matched annotation survives.
   *
   * @throws Exception
   */

  @Test
  public void unmatchedAnnotationSurvives() throws Exception {
    Object[] params = new Object[] { "FilterOut", true, "Pattern", "baaaa!", "Type", "net.hitsujiwool.uima.regex_filter.types.ExampleType" };

    this.runEngine(params);

    Assert.assertTrue(JCasUtil.select(this.jCas, ExampleType.class).contains(this.annoGoat));
  }

}
