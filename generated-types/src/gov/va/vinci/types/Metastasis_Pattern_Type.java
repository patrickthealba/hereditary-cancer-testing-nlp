
/* First created by JCasGen Tue Oct 01 11:50:59 CDT 2019 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType_Type;

/** 
 * Updated by JCasGen Tue Oct 01 11:50:59 CDT 2019
 * @generated */
public class Metastasis_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Metastasis_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Metastasis_Pattern");
 
  /** @generated */
  final Feature casFeat_Modifier;
  /** @generated */
  final int     casFeatCode_Modifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModifier(int addr) {
        if (featOkTst && casFeat_Modifier == null)
      jcas.throwFeatMissing("Modifier", "gov.va.vinci.types.Metastasis_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier(int addr, String v) {
        if (featOkTst && casFeat_Modifier == null)
      jcas.throwFeatMissing("Modifier", "gov.va.vinci.types.Metastasis_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Metastasis_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Modifier = jcas.getRequiredFeatureDE(casType, "Modifier", "uima.cas.String", featOkTst);
    casFeatCode_Modifier  = (null == casFeat_Modifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Modifier).getCode();

  }
}



    