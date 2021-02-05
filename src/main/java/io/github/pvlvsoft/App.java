package io.github.pvlvsoft;


import io.github.pvlvsoft.charon.fingerprint.DeviceFingerprint;
import io.github.pvlvsoft.charon.fingerprint.attrs.FingerprintAttribute;

import java.net.SocketException;
import java.net.UnknownHostException;


/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws SocketException, UnknownHostException {

        DeviceFingerprint fp = new DeviceFingerprint();

        for (FingerprintAttribute fpa : fp.getAttributes()) {

            System.out.println(fpa.getAttributeName() + ": " + fpa.getAttributeValue());
        }
    }
}
