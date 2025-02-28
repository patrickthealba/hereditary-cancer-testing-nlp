
/* First created by JCasGen Thu Aug 15 08:32:44 CDT 2024 */
package gov.va.vinci.leo.sentence.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Sentence Type
 * Updated by JCasGen Thu Aug 15 08:32:44 CDT 2024
 * @generated */
public class AnchoredSentence_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnchoredSentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.leo.sentence.types.AnchoredSentence");
 
  /** @generated */
  final Feature casFeat_Anchor;
  /** @generated */
  final int     casFeatCode_Anchor;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnchor(int addr) {
        if (featOkTst && casFeat_Anchor == null)
      jcas.throwFeatMissing("Anchor", "gov.va.vinci.leo.sentence.types.AnchoredSentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Anchor);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchor(int addr, int v) {
        if (featOkTst && casFeat_Anchor == null)
      jcas.throwFeatMissing("Anchor", "gov.va.vinci.leo.sentence.types.AnchoredSentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_Anchor, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnchoredSentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Anchor = jcas.getRequiredFeatureDE(casType, "Anchor", "uima.tcas.Annotation", featOkTst);
    casFeatCode_Anchor  = (null == casFeat_Anchor) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anchor).getCode();

  }
}



    