import java.security.PublicKey;
import java.security.Signature;
import java.nio.charset.StandardCharsets;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.util.Base64URL;

public class Verify {

    private static final String ECDSA_ALGORITHM = "SHA256withECDSA";
	
    public PublicKey decodePubKey(String encodedPubKey) {
        try {
            ECKey jwk = ECKey.parse(encodedPubKey);
            return jwk.toKeyPair().getPublic();
        } //catch (ParseException | JOSEException e) {
           // throw new PKIException(Messages.PKI_EXCEPTION, e);
       // }
        catch (Exception e) {
    }
		return null;
    }
    
    public boolean verifySignature(PublicKey publicKey, String data, String signatureBase64UrlEncoded) {
        try {
            Signature dsa = Signature.getInstance(ECDSA_ALGORITHM);
            dsa.initVerify(publicKey);
            dsa.update(data.getBytes(StandardCharsets.UTF_8));
            return dsa.verify(Base64URL.from(signatureBase64UrlEncoded).decode());
        }// catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException e) {
           // logger.debug("Could not verify signature {}, {}, {}", data, signatureBase64UrlEncoded, e.getMessage());
            // logger.warn("Could not verify signature", e);
        	catch (Exception e) {
        }
        return false;
    }
   
	public static void main(String[] args){
        try {
            Verify verify = new Verify();
        }
        catch (Exception ex) {
        	
        }
	}
	}
