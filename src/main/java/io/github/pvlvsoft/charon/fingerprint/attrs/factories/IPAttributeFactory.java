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
 * <p>Class of {@link IPAttributeFactory} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2021-02-04
 *
 * @see IPAttributeFactory
 * @see MACAttributeFactory
 * @see DeviceNameAttributeFactory
 */
public class IPAttributeFactory extends AbstractFPAFactory {

    /* =========================================================== */
    /* ====== INSTANCE VARIABLES ================================= */




    /* =========================================================== */
    /* ====== STATIC VARIABLES =================================== */

    private static final String DEFAULT_NAME = "ip_address";


    /* =========================================================== */
    /* ====== INSTANCE INIT BLOCKS =============================== */




    /* =========================================================== */
    /* ====== STATIC INIT BLOCKS ================================= */





    /* =========================================================== */
    /* ====== CONSTRUCTORS ======================================= */

    public IPAttributeFactory() {

        super(DEFAULT_NAME);
    }


    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */

    /**
     * <p>Creates a {@link FingerprintAttribute} instance by the rules of this class.</p>
     *
     * @return Creates a {@link List} of {@link FingerprintAttribute} instance
     * with the predefined names and generated values.
     *
     * @throws UnknownHostException     When the localhost is not known
     */
    @Override
    public List<FingerprintAttribute> create() throws UnknownHostException {

        List<FingerprintAttribute> ips = new ArrayList<>();
        ips.add(new FingerprintAttribute(this.getAttributeName(), Network.getLocalHost().getHostAddress()));

        return ips;
    }


    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */






    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */




    /* =========================================================== */
    /* ====== GETTERS AND SETTERS ================================ */


}
