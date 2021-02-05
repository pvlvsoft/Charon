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
 * <p>Interface of {@link FingerprintAttributeFactory} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 * <p>This factory interface defines the base of {@link FingerprintAttribute} build
 * using the <i>Factory design pattern</i>.</p>
 *
 * <p>These instances can be used for dynamic calculating or
 * generating attribute values of a {@link Fingerprint}.</p>
 *
 * @author Vojtech Pavlu
 * @version 2021-02-04
 *
 * @see FingerprintAttribute
 * @see Fingerprint
 */
public interface FingerprintAttributeFactory {

    /**
     * <p>Creates a {@link FingerprintAttribute} instance by the rules of this class.</p>
     *
     * @return  Creates a {@link java.util.List} of {@link FingerprintAttribute} instance
     *          with the predefined names and generated values.
     */
    public java.util.List<FingerprintAttribute> create() throws Exception;

    /**
     * <p>Returns the default attribute name.</p>
     *
     * @return  {@link String}-formed name of the {@link FingerprintAttribute}
     */
    public String getAttributeName();
}
