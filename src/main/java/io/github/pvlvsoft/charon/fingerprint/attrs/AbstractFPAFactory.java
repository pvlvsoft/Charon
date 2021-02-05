package io.github.pvlvsoft.charon.fingerprint.attrs;


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
 * <p>Class of {@link AbstractFPAFactory} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p>This class is abstract, it can be instantiated by it's
 * descendants only.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2021-02-04
 */
public abstract class AbstractFPAFactory implements FingerprintAttributeFactory {


    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */

    private String name;


    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */




    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */


    protected AbstractFPAFactory(String name) {

        this.name = name.toLowerCase();
    }


    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */

    /**
     * <p>Returns the default attribute name.</p>
     *
     * @return {@link String}-formed name of the {@link FingerprintAttribute}
     */
    @Override
    public String getAttributeName() {

        return this.name;
    }

    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */





    /* =========================================================== */
    /* ====== ABSTRACT METHODS =================================== */






    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */




    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */



}