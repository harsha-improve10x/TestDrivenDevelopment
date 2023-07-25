package Encryption;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EncryptionTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnAca() {
        Encryption encryption = new Encryption();
        String result = encryption.encrypt(null);
        assertEquals("aca", result);
    }
}
