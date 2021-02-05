package io.github.pvlvsoft.charon.fingerprint;


import io.github.pvlvsoft.charon.fingerprint.attrs.FingerprintAttribute;

import java.io.Serializable;


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
 * <p>Interface of {@link Fingerprint} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2021-02-04
 *
 * @see java.io.Serializable
 * @see FingerprintAttribute
 */
public interface Fingerprint extends Serializable {

    /**
     * <p>This method returns if it contains an attribute with such a name.</p>
     *
     * @param name  the attribute should have. Ignores casing (differences
     *              between lower and upper cases does not matter).
     *
     * @return      only if there is an attribute with such a name, it returns
     *              {@code true}. Otherwise it returns {@code false}.
     */
    public boolean hasAttribute(String name);


    /**
     * <p>This method returns all the attributes with such a name. If it has no such
     * an attribute, gives back an {@link java.util.ArrayList} instance with size equal
     * to 0.</p>
     *
     * @param name  which has to be used to identify the attribute. Casing does not matter.
     *
     * @return      {@link java.util.ArrayList} of all the {@link FingerprintAttribute}
     *              in the {@link Fingerprint} with such a name.
     */
    public java.util.List<FingerprintAttribute> getAttribute(String name);
}
