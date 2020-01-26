import static org.junit.Assert.*;
import org.junit.*;

public class CipherTest {
    @Test
    public void normalText_collectsUserInput(){
        Cipher testCipher = new Cipher("Louis", 5);
        assertEquals(true, testCipher instanceof Cipher);
    }


}