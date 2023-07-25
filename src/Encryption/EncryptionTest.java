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
        String result = encryption.encrypt(null);
        assertEquals("aca", result);
    }

}
