package io.github.pvlvsoft.charon.fingerprint.attrs;


import io.github.pvlvsoft.charon.fingerprint.Fingerprint;


/**
 * <i>AUTHOR OF THIS PROJECT IS NOT RESPONSIBLE FOR ANY DAMAGE TO
 * THE USER'S DEVICE CAUSED BY USING THIS SOFTWARE, NO DATA LEAKS
 * OR DATA INTEGRITY DAMAGE.</i>
 *
 * <i>THIS PIECE OF SOFTWARE WAS MADE WITH NO GUARANTEE AND SHOULD
 * NOT BE USED FOR CRITICAL INFRASTRUCTURE OF YOUR APPS. THIS
 * PROJECT WAS CREATED JUST FOR FUN.</i>
 *
 *
 * <p>Class of {@link FingerprintAttribute} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 *
 * <p>This class describes the key-value form of the {@link Fingerprint}
 * attribute. Developers may use multiple values for each of the key. This
 * solves the problem by sealing the key-value principle in to a separate value.</p>
 *
 * @author Vojtech Pavlu
 * @version 2021-02-04
 *
 * @see java.io.Serializable
 * @see Fingerprint
 */
public class FingerprintAttribute {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */

    private String attributeName;
    private String attributeValue;


    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */




    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */

    public FingerprintAttribute(String attributeName, String attributeValue) {

        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }


    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */

    /**
     * <p>Returns {@link String} interpretation of the instance.</p>
     * <p>Method is overridden from {@link Object} class.</p>
     */
    @Override
    public String toString() {
        return "FingerprintA{" +
                "attributeName='" + attributeName + '\'' +
                ", attributeValue='" + attributeValue + '\'' +
                '}';
    }



    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */






    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */




    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */


    /**
     * <p>This method returns the name of the attribute. Does not have to be unique,
     * can be used in the {@link Fingerprint} multiple times.</p>
     *
     * @return  {@link String}-formed name of the attribute.
     */
    public String getAttributeName() {

        return this.attributeName;
    }


    /**
     * <p>This method returns the value mapped to the name. It's in the
     * text form.</p>
     *
     * @return  {@link String}-formed value linked to the given name.
     */
    public String getAttributeValue() {

        return this.attributeValue;
    }
}
