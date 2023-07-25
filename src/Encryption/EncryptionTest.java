package Encryption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EncryptionTest {
    private Encryption encryption;
    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        encryption = new Encryption();
    }

    @Test
    public void givenNull_returnAca() {
        String result = encryption.encrypt(null);
        assertEquals("aca", result);
    }

    @Test
    public void givenEmpty_returnAca() {
        String result = encryption.encrypt("");
        assertEquals("aca", result);
    }

    @Test
    public void givenB_returnBaca() {
        String result = encryption.encrypt("b");
        assertEquals("baca", result);
    }

    @Test
    public void givenX_returnXaca() {
        String result = encryption.encrypt("x");
        assertEquals("xaca", result);
    }

    @Test
    public void givenA_return0Aca() {
        String result = encryption.encrypt("a");
        assertEquals("0aca", result);
    }

    @Test
    public void givenE_return1Aca() {
        String result = encryption.encrypt("e");
        assertEquals("1aca", result);
    }

    @Test
    public void givenI_return2Aca() {
        String result = encryption.encrypt("i");
        assertEquals("2aca", result);
    }

    @Test
    public void givenO_return3Aca() {
        String result = encryption.encrypt("o");
        assertEquals("3aca", result);
    }

    @Test
    public void givenU_return4Aca() {
        String result = encryption.encrypt("u");
        assertEquals("4aca", result);
    }
}
