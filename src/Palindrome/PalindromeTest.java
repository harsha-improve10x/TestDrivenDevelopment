package Palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    private Palindrome palindrome;
    @Test
    public void nothing() {}

    @BeforeEach
    public void setup() {
        palindrome = new Palindrome();
    }

    @Test
    public void givenNull_returnFalse() {
        boolean result = palindrome.isPalindrome(null);
        assertEquals(false, result);
    }

    @Test
    public void givenEmpty_returnTrue() {
        boolean result = palindrome.isPalindrome("");
        assertEquals(true, result);
    }

    @Test
    public void givenA_returnTrue() {
        boolean result = palindrome.isPalindrome("A");
        assertEquals(true, result);
    }

    @Test
    public void givenAB_returnFalse() {
        boolean result = palindrome.isPalindrome("AB");
        assertEquals(false, result);
    }
}
