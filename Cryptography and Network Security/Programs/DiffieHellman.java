import java.math.BigInteger; 
import java.security.KeyFactory; 
import java.security.KeyPair; 
import java.security.KeyPairGenerator; 
import java.security.SecureRandom; 
import javax.crypto.spec.DHParameterSpec; 
import javax.crypto.spec.DHPublicKeySpec; 
public class DiffeHellman { 
public final static int pValue = 47; 
public final static int gValue = 71; 
public final static int XaValue = 9; 
public final static int XbValue = 14; 
public static void main(String[] args) throws Exception { 
        // TODO code application logic here 
BigInteger p = new BigInteger(Integer.toString(pValue)); 
BigInteger g = new BigInteger(Integer.toString(gValue)); 
BigIntegerXa = new BigInteger(Integer.toString(XaValue)); 
BigIntegerXb = new BigInteger(Integer.toString(XbValue)); 
createKey(); 
intbitLength = 512; // 512 bits 
SecureRandomrnd = new SecureRandom(); 
        p = BigInteger.probablePrime(bitLength, rnd); 
        g = BigInteger.probablePrime(bitLength, rnd); 
createSpecificKey(p, g); 
    } 
public static void createKey() throws Exception { 
KeyPairGeneratorkpg = KeyPairGenerator.getInstance("DiffieHellman"); 
kpg.initialize(512); 
KeyPairkp = kpg.generateKeyPair(); 
KeyFactorykfactory = KeyFactory
.getInstance("DiffieHellman"); 
DHPublicKeySpeckspec  =  (DHPublicKeySpec)  kfactory.getKeySpec(kp.getPublic(),  
DHPublicKeySpec.class); 
System.out.println("Public key is: " +kspec); 
    } 
public static void createSpecificKey(BigInte
ger p, BigInteger g) throws Exception { 
KeyPairGeneratorkpg = KeyPairGenerator.getInstance("DiffieHellman"); 
DHParameterSpecparam = new DHParameterSpec(p, g); 
kpg.initialize(param); 
KeyPairkp = kpg.generateKeyPair(); 
KeyFactorykfactory = KeyFactory
.getInstance("DiffieHellman"); 
DHPublicKeySpeckspec  =  (DHPublicKeySpec)  kfactory.getKeySpec(kp.getPublic(),  
DHPublicKeySpec.class); 
System.out.println("\nPublic key is : " +kspec); 
    } 
} 
