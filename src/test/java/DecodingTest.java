import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {
    @Test
    public void nonEncryptedText_collectsUserData(){
        Decoding decodingTest = new Decoding("Louis", 5);
        assertEquals(true, decodingTest instanceof Decoding);
    }
    @Test
    public void takeUserInput_getsUserInput_String(){
        Decoding decodingTest = new Decoding("Louis", 5);
        assertEquals("Louis", decodingTest.getUserInput());
    }
    @Test
    public void takeUserKey_getsUserKey_int(){
        Decoding testDecoding = new Decoding("Louis", 5);
        assertEquals(5, testDecoding.getShiftKey());
    }

}