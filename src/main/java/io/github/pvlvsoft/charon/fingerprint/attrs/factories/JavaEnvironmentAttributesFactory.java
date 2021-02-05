package io.github.pvlvsoft.charon.fingerprint.attrs.factories;


import io.github.pvlvsoft.charon.fingerprint.attrs.FingerprintAttribute;
import io.github.pvlvsoft.charon.fingerprint.attrs.FingerprintAttributeFactory;

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
 * <p>Class of {@link JavaEnvironmentAttributesFactory} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2021-02-05
 */
public class JavaEnvironmentAttributesFactory implements FingerprintAttributeFactory {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */




    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */




    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */





    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */

    /**
     * <p>Creates a {@link FingerprintAttribute} instance by the rules of this class.</p>
     *
     * @return Creates a {@link List} of {@link FingerprintAttribute} instance
     * with the predefined names and generated values.
     */
    @Override
    public List<FingerprintAttribute> create() {

        List<FingerprintAttribute> fpa = new ArrayList<>();
        fpa.add(new FingerprintAttribute("java_version", System.getProperty("java.version")));
        fpa.add(new FingerprintAttribute("java_vendor", System.getProperty("java.vendor")));
        fpa.add(new FingerprintAttribute("java_vendor_url", System.getProperty("java.vendor.url")));
        fpa.add(new FingerprintAttribute("java_vm_specification_version", System.getProperty("java.vm.specification.version")));
        fpa.add(new FingerprintAttribute("java_vm_specification_vendor", System.getProperty("java.vm.specification.vendor")));
        fpa.add(new FingerprintAttribute("java_vm_specification_name", System.getProperty("java.vm.specification.name")));
        fpa.add(new FingerprintAttribute("java_vm_version", System.getProperty("java.vm.version")));
        fpa.add(new FingerprintAttribute("java_vm_vendor", System.getProperty("java.vm.vendor")));
        fpa.add(new FingerprintAttribute("java_vm_name", System.getProperty("java.vm.name")));
        fpa.add(new FingerprintAttribute("java_specification_version", System.getProperty("java.specification.version")));
        fpa.add(new FingerprintAttribute("java_specification_vendor", System.getProperty("java.specification.vendor")));
        fpa.add(new FingerprintAttribute("java_specification_name", System.getProperty("java.specification.name")));
        fpa.add(new FingerprintAttribute("java_class_version", System.getProperty("java.class.version")));
        fpa.add(new FingerprintAttribute("java_compiler", System.getProperty("java.compiler")));

        return fpa;
    }

    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */






    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */




    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */

    /**
     * <p>Returns the default attribute name.</p>
     *
     * @return {@link String}-formed name of the {@link FingerprintAttribute}
     */
    @Override
    public String getAttributeName() {

        throw new UnsupportedOperationException(this.getClass().toString() + " does not support single attribute.");
    }


    /* =========================================================== */
    /* ====== MAIN METHOD ======================================== */

    /*
    public static void main(String[] args) {
        
        System.out.println(">>> QUICK TEST OF JavaEnvironmentAttributesFactory BEGINS!");
        
        
        System.out.println(">>> QUICK TEST OF JavaEnvironmentAttributesFactory ENDED SUCCESSFULLY!");
    }
    */

}
