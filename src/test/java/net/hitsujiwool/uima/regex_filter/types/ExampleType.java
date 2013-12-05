

/* First created by JCasGen Wed Dec 04 08:43:49 CET 2013 */
package net.hitsujiwool.uima.regex_filter.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Dec 04 08:43:49 CET 2013
 * XML source: /Users/ryo/ttc/workspace/uima-regex-filter/src/test/resources/net/hitsujiwool/uima/org.apache.uima.fit/types/ExampleTypeSystem.xml
 * @generated */
public class ExampleType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ExampleType.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ExampleType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ExampleType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ExampleType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ExampleType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: foo

  /** getter for foo - gets 
   * @generated */
  public String getFoo() {
    if (ExampleType_Type.featOkTst && ((ExampleType_Type)jcasType).casFeat_foo == null)
      jcasType.jcas.throwFeatMissing("foo", "net.hitsujiwool.uima.org.apache.uima.fit.types.ExampleType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ExampleType_Type)jcasType).casFeatCode_foo);}
    
  /** setter for foo - sets  
   * @generated */
  public void setFoo(String v) {
    if (ExampleType_Type.featOkTst && ((ExampleType_Type)jcasType).casFeat_foo == null)
      jcasType.jcas.throwFeatMissing("foo", "net.hitsujiwool.uima.org.apache.uima.fit.types.ExampleType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ExampleType_Type)jcasType).casFeatCode_foo, v);}    
   
    
  //*--------------*
  //* Feature: bar

  /** getter for bar - gets 
   * @generated */
  public int getBar() {
    if (ExampleType_Type.featOkTst && ((ExampleType_Type)jcasType).casFeat_bar == null)
      jcasType.jcas.throwFeatMissing("bar", "net.hitsujiwool.uima.org.apache.uima.fit.types.ExampleType");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ExampleType_Type)jcasType).casFeatCode_bar);}
    
  /** setter for bar - sets  
   * @generated */
  public void setBar(int v) {
    if (ExampleType_Type.featOkTst && ((ExampleType_Type)jcasType).casFeat_bar == null)
      jcasType.jcas.throwFeatMissing("bar", "net.hitsujiwool.uima.org.apache.uima.fit.types.ExampleType");
    jcasType.ll_cas.ll_setIntValue(addr, ((ExampleType_Type)jcasType).casFeatCode_bar, v);}    
  }

    