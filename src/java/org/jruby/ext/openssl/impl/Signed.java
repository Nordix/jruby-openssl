/***** BEGIN LICENSE BLOCK *****
 * Version: CPL 1.0/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Common Public
 * License Version 1.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.eclipse.org/legal/cpl-v10.html
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * Copyright (C) 2008 Ola Bini <ola.bini@gmail.com>
 * 
 * Alternatively, the contents of this file may be used under the terms of
 * either of the GNU General Public License Version 2 or later (the "GPL"),
 * or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the CPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the CPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK *****/
package org.jruby.ext.openssl.impl;

import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.DEREncodable;

/** PKCS7_SIGNED
 *
 * @author <a href="mailto:ola.bini@gmail.com">Ola Bini</a>
 */
public class Signed {
    /**
     * Describe version here.
     */
    private int version;

    /**
     * Describe crl here.
     */
    private List<X509CRL> crl = new ArrayList<X509CRL>();

    /**
     * Describe cert here.
     */
    private List<X509Certificate> cert = new ArrayList<X509Certificate>();

    /**
     * Describe mdAlgs here.
     */
    private Set<String> mdAlgs = new HashSet<String>();

    /**
     * Describe signerInfo here.
     */
    private List<SignerInfo> signerInfo = new ArrayList<SignerInfo>();

    PKCS7 contents;

    /**
     * Get the <code>Version</code> value.
     *
     * @return an <code>int</code> value
     */
    public final int getVersion() {
        return version;
    }

    /**
     * Set the <code>Version</code> value.
     *
     * @param newVersion The new Version value.
     */
    public final void setVersion(final int newVersion) {
        this.version = newVersion;
    }

    /**
     * Get the <code>SignerInfo</code> value.
     *
     * @return a <code>List<SignerInfo></code> value
     */
    public final List<SignerInfo> getSignerInfo() {
        return signerInfo;
    }

    /**
     * Set the <code>SignerInfo</code> value.
     *
     * @param newSignerInfo The new SignerInfo value.
     */
    public final void setSignerInfo(final List<SignerInfo> newSignerInfo) {
        this.signerInfo = newSignerInfo;
    }

    /**
     * Get the <code>MdAlgs</code> value.
     *
     * @return a <code>Set<String></code> value
     */
    public final Set<String> getMdAlgs() {
        return mdAlgs;
    }

    /**
     * Set the <code>MdAlgs</code> value.
     *
     * @param newMdAlgs The new MdAlgs value.
     */
    public final void setMdAlgs(final Set<String> newMdAlgs) {
        this.mdAlgs = newMdAlgs;
    }

    /**
     * Get the <code>Contents</code> value.
     *
     * @return a <code>PKCS7</code> value
     */
    public final PKCS7 getContents() {
        return contents;
    }

    /**
     * Set the <code>Contents</code> value.
     *
     * @param newContents The new Contents value.
     */
    public final void setContents(final PKCS7 newContents) {
        this.contents = newContents;
    }

    /**
     * Get the <code>Cert</code> value.
     *
     * @return a <code>List<X509Certificate></code> value
     */
    public final List<X509Certificate> getCert() {
        return cert;
    }

    /**
     * Set the <code>Cert</code> value.
     *
     * @param newCert The new Cert value.
     */
    public final void setCert(final List<X509Certificate> newCert) {
        this.cert = newCert;
    }

    /**
     * Get the <code>Crl</code> value.
     *
     * @return a <code>List<X509CRL></code> value
     */
    public final List<X509CRL> getCrl() {
        return crl;
    }

    /**
     * Set the <code>Crl</code> value.
     *
     * @param newCrl The new Crl value.
     */
    public final void setCrl(final List<X509CRL> newCrl) {
        this.crl = newCrl;
    }

    /**
     * SignedData ::= SEQUENCE {
     *   version Version,
     *   digestAlgorithms DigestAlgorithmIdentifiers,
     *   contentInfo ContentInfo,
     *   certificates [0] IMPLICIT ExtendedCertificatesAndCertificates OPTIONAL,
     *   crls [1] IMPLICIT CertificateRevocationLists OPTIONAL,
     *   signerInfos SignerInfos }
     *
     * DigestAlgorithmIdentifiers ::= SET OF DigestAlgorithmIdentifier
     *
     * SignerInfos ::= SET OF SignerInfo
     */
    public static Signed fromASN1(DEREncodable content) {
        throw new UnsupportedOperationException("TODO: can't create Signed from ASN1 yet");
    }
}// Signed
