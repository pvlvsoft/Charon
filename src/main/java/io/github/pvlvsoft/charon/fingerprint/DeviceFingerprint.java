package io.github.pvlvsoft.charon.fingerprint;


import io.github.pvlvsoft.charon.fingerprint.attrs.FingerprintAttribute;
import io.github.pvlvsoft.charon.fingerprint.attrs.factories.*;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;


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
 * <p>Class of {@link DeviceFingerprint} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2021-02-05
 */
public class DeviceFingerprint implements Fingerprint {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */

    private List<FingerprintAttribute> attributes = new ArrayList<>();


    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */




    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */

    public DeviceFingerprint() throws UnknownHostException, SocketException {

        this.attributes.addAll(new DeviceNameAttributeFactory().create());
        this.attributes.addAll(new IPAttributeFactory().create());
        this.attributes.addAll(new MACAttributeFactory().create());
        this.attributes.addAll(new SystemAttributesFactory().create());
        this.attributes.addAll(new JavaEnvironmentAttributesFactory().create());
    }


    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */

    /**
     * <p>This method returns if it contains an attribute with such a name.</p>
     *
     * @param name the attribute should have. Ignores casing (differences
     *             between lower and upper cases does not matter).
     *
     * @return only if there is an attribute with such a name, it returns
     * {@code true}. Otherwise it returns {@code false}.
     */
    @Override
    public boolean hasAttribute(String name) {

        name = name.toLowerCase();

        for (FingerprintAttribute fpa : this.attributes) {

            if(fpa.getAttributeName().equals(name)) {

                return true;
            }
        }

        return false;
    }



    /**
     * <p>This method returns all the attributes with such a name. If it has no such
     * an attribute, gives back an {@link ArrayList} instance with size equal
     * to 0.</p>
     *
     * @param name which has to be used to identify the attribute. Casing does not matter.
     *
     * @return {@link ArrayList} of all the {@link FingerprintAttribute}
     * in the {@link Fingerprint} with such a name.
     */
    @Override
    public List<FingerprintAttribute> getAttribute(String name) {

        List<FingerprintAttribute> fpa = new ArrayList<>();
        name = name.toLowerCase();

        for (FingerprintAttribute attr : this.attributes) {

            if(attr.getAttributeName().equals(name)) {

                fpa.add(attr);
            }
        }

        return fpa;
    }


    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */





    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */




    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */

    public List<FingerprintAttribute> getAttributes() {
        return attributes;
    }

    /* =========================================================== */
    /* ====== MAIN METHOD ======================================== */

    /*
    public static void main(String[] args) {
        
        System.out.println(">>> QUICK TEST OF DeviceFingerprint BEGINS!");
        
        
        System.out.println(">>> QUICK TEST OF DeviceFingerprint ENDED SUCCESSFULLY!");
    }
    */

}
