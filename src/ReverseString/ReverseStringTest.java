package ReverseString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    private ReverseString reverseString;
    /*
    Problem: Create a method that takes a string
     as its argument and returns the string in reversed order.
     Example:   reverse("Hello World") ➞ "dlroW olleH"
                reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"
                reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"
     */

    @Test
    public void nothing() {}

    @BeforeEach
    private void setup() {
        reverseString = new ReverseString();
    }

    @Test
    public void givenNull_returnNull() {
        String reverse = reverseString.reverseString("");
        assertEquals("", reverse);
    }

    @Test
    public void givenH_returnH() {
        String reverse = reverseString.reverseString("H");
        assertEquals("H", reverse);
    }

    @Test
    public void givenHe_returneH() {
        String reverse = reverseString.reverseString("He");
        assertEquals("eH", reverse);
    }

    @Test
    public void givenHello_returnolleH() {
        String reverse = reverseString.reverseString("Hello");
        assertEquals("olleH", reverse);
    }

    @Test
    public void givenHello_World_returndlroW_olleH() {
        String reverse = reverseString.reverseString("Hello World");
        assertEquals("dlroW olleH", reverse);
    }
}
