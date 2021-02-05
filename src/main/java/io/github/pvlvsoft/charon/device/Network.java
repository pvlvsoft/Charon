package io.github.pvlvsoft.charon.device;


import java.net.InetAddress;
import java.net.NetworkInterface;
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
 * <p>Class of {@link Network} is an abstract representation
 * and implementation of the instances belonging to this class.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2021-02-04
 */
public class Network {

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


    private Network() {}


    /* =========================================================== */
    /* ====== OVERRIDDEN METHODS ================================= */



    /* =========================================================== */
    /* ====== INSTANCE METHODS =================================== */






    /* =========================================================== */
    /* ====== STATIC METHODS ===================================== */


    /**
     * <p>This static method returns all the {@link InetAddress} this device has.</p>
     *
     * @return                      A {@link List} of all the {@link InetAddress} instances.
     *                              It can be used for getting all the IP addresses, or network
     *                              interface names etc.
     *
     * @throws SocketException      When there an I/O error occurs.
     */
    public static List<InetAddress> getAllInetAddresses() throws SocketException {

        List<InetAddress> addrList = new ArrayList<>();

        for(java.util.Enumeration<NetworkInterface> eni = NetworkInterface.getNetworkInterfaces(); eni.hasMoreElements();) {

            final NetworkInterface ifc = eni.nextElement();

            if(ifc.isUp()) {

                for(java.util.Enumeration<InetAddress> ena = ifc.getInetAddresses(); ena.hasMoreElements(); ) {

                    addrList.add(ena.nextElement());
                }
            }
        }

        return addrList;
    }


    /**
     * <p>This method returns the {@link InetAddress} instance representing this localhost.</p>
     *
     * @return                          localhost represented by the {@link InetAddress}.
     *
     * @throws UnknownHostException     if the local host name could not be resolved into an address
     */
    public static InetAddress getLocalHost() throws UnknownHostException {

        return InetAddress.getLocalHost();
    }


    /**
     * <p>Returns a MAC address for the given InetAddress.</p>
     *
     * @param address               to be searched with
     *
     * @return                      {@link String}-formed MAC address. Each byte is separated
     *                              by colon (":"). Every byte is represented by values in between
     *                              0 and F.
     *
     * @throws SocketException      if an I/O error occurs
     */
    public static String getMACAddress(InetAddress address) throws SocketException {

        byte[] mac = NetworkInterface.getByInetAddress(address).getHardwareAddress();

        if (mac != null) {

            String result;

            if (mac.length == 0) {

                result = "";

            } else {

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < mac.length; i++) {

                    int tmpe = mac[i] & 0xff;

                    String s = Integer.toHexString(tmpe);

                    if (i == mac.length - 1) {

                        sb.append(s);

                    } else {

                        sb.append(s).append(":");
                    }
                }

                result = sb.toString();
            }

            return result.toUpperCase();

        } else {

            return null;
        }
    }


    public static String getDeviceName(InetAddress address) {

        return address.getHostName();
    }
}
