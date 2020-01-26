import static org.junit.Assert.*;
import org.junit.*;

public class CipherTest {
    @Test
    public void nonEncryptedText_collectsUserData(){
        Cipher testCipher = new Cipher("Louis", 5);
        assertEquals(true, testCipher instanceof Cipher);
    }
    @Test
    public void takeUserInput_getsUserInput_String(){
        Cipher testCipher = new Cipher("Louis", 5);
        assertEquals("Louis", testCipher.getUserInput());
    }


}