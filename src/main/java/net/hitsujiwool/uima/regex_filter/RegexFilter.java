package net.hitsujiwool.uima.regex_filter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;

public class RegexFilter extends JCasAnnotator_ImplBase {

  private Pattern pattern;
  
  private String typeString;
  
  private Boolean filterOut;

  private Logger logger;
    
  @Override
  public void initialize(UimaContext ctx) throws ResourceInitializationException {
    this.pattern = Pattern.compile((String) ctx.getConfigParameterValue("Pattern"));
    this.typeString = (String) ctx.getConfigParameterValue("Type");
    this.filterOut = (Boolean) ctx.getConfigParameterValue("FilterOut");
    this.logger = ctx.getLogger();
  }
  
  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {
    Type type = jCas.getTypeSystem().getType(this.typeString);
    FSIterator<Annotation> iter = jCas.getAnnotationIndex(type).iterator();
    List<Annotation> toBeRemoved = new ArrayList<Annotation>();
    while (iter.isValid()) {
      Annotation anno = iter.get();
      Matcher m = this.pattern.matcher(anno.getCoveredText());
      if (m.find() == this.filterOut.booleanValue()) {
        logger.log(Level.FINEST, "× " + anno.getCoveredText());
        toBeRemoved.add(anno);
      } else {
        logger.log(Level.FINEST, "○ " + anno.getCoveredText());
      }
      iter.moveToNext();
    }
    for (Annotation anno : toBeRemoved) {
      anno.removeFromIndexes();
    }
  }
}
