package Palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnFalse() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("");
        assertEquals(false, result);
    }
}
