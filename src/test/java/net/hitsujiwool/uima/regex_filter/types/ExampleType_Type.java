
/* First created by JCasGen Wed Dec 04 08:43:49 CET 2013 */
package net.hitsujiwool.uima.regex_filter.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Dec 04 08:43:49 CET 2013
 * @generated */
public class ExampleType_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ExampleType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ExampleType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ExampleType(addr, ExampleType_Type.this);
  			   ExampleType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ExampleType(addr, ExampleType_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ExampleType.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.hitsujiwool.uima.org.apache.uima.fit.types.ExampleType");
 
  /** @generated */
  final Feature casFeat_foo;
  /** @generated */
  final int     casFeatCode_foo;
  /** @generated */ 
  public String getFoo(int addr) {
        if (featOkTst && casFeat_foo == null)
      jcas.throwFeatMissing("foo", "net.hitsujiwool.uima.org.apache.uima.fit.types.ExampleType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_foo);
  }
  /** @generated */    
  public void setFoo(int addr, String v) {
        if (featOkTst && casFeat_foo == null)
      jcas.throwFeatMissing("foo", "net.hitsujiwool.uima.org.apache.uima.fit.types.ExampleType");
    ll_cas.ll_setStringValue(addr, casFeatCode_foo, v);}
    
  
 
  /** @generated */
  final Feature casFeat_bar;
  /** @generated */
  final int     casFeatCode_bar;
  /** @generated */ 
  public int getBar(int addr) {
        if (featOkTst && casFeat_bar == null)
      jcas.throwFeatMissing("bar", "net.hitsujiwool.uima.org.apache.uima.fit.types.ExampleType");
    return ll_cas.ll_getIntValue(addr, casFeatCode_bar);
  }
  /** @generated */    
  public void setBar(int addr, int v) {
        if (featOkTst && casFeat_bar == null)
      jcas.throwFeatMissing("bar", "net.hitsujiwool.uima.org.apache.uima.fit.types.ExampleType");
    ll_cas.ll_setIntValue(addr, casFeatCode_bar, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ExampleType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_foo = jcas.getRequiredFeatureDE(casType, "foo", "uima.cas.String", featOkTst);
    casFeatCode_foo  = (null == casFeat_foo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_foo).getCode();

 
    casFeat_bar = jcas.getRequiredFeatureDE(casType, "bar", "uima.cas.Integer", featOkTst);
    casFeatCode_bar  = (null == casFeat_bar) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bar).getCode();

  }
}



    