package io.github.pvlvsoft.charon.fingerprint.attrs.factories;


import io.github.pvlvsoft.charon.device.Network;
import io.github.pvlvsoft.charon.fingerprint.attrs.AbstractFPAFactory;
import io.github.pvlvsoft.charon.fingerprint.attrs.FingerprintAttribute;

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
 * <p>Class of {@link DeviceNameAttributeFactory} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p>Resolves the </p>
 *
 * @author Vojtech Pavlu
 * @version 2021-02-04
 *
 * @see IPAttributeFactory
 * @see MACAttributeFactory
 * @see DeviceNameAttributeFactory
 */
public class DeviceNameAttributeFactory extends AbstractFPAFactory {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */




    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */

    private static final String DEFAULT_NAME = "device_name";


    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */

    public DeviceNameAttributeFactory() {

        super(DEFAULT_NAME);
    }


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
        try {

            fpa.add(new FingerprintAttribute(this.getAttributeName(), Network.getLocalHost().getHostName()));

        } catch (UnknownHostException e) {

            fpa.add(new FingerprintAttribute(this.getAttributeName(), ""));
        }

        return fpa;
    }


    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */






    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */




    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */




    /* =========================================================== */
    /* ====== MAIN METHOD ======================================== */


    public static void main(String[] args) {
        
        System.out.println(">>> QUICK TEST OF DeviceNameAttributeFactory BEGINS!");

        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
        System.out.println((float) maxMemory/(1024L) + " kb");
        System.out.println((float) maxMemory/(1024L*1024L) + " Mb");
        System.out.println((float) maxMemory/(1024L*1024L*1024L) + " Gb");


        System.out.println("-----------------------------------");

        for (FingerprintAttribute fp : new SystemAttributesFactory().create()) {

            System.out.println(fp.getAttributeName() + ": " + fp.getAttributeValue());
        }

        System.out.println(">>> QUICK TEST OF DeviceNameAttributeFactory ENDED SUCCESSFULLY!");
    }


}
