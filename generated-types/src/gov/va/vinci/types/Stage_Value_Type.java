
/* First created by JCasGen Tue Oct 01 11:51:00 CDT 2019 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import gov.va.vinci.leo.regex.types.RegularExpressionType_Type;

/** 
 * Updated by JCasGen Tue Oct 01 11:51:00 CDT 2019
 * @generated */
public class Stage_Value_Type extends RegularExpressionType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Stage_Value.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Stage_Value");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Stage_Value_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    