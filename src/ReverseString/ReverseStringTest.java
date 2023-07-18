package ReverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {

    /*
    Problem: Create a method that takes a string
     as its argument and returns the string in reversed order.
     Example:   reverse("Hello World") ➞ "dlroW olleH"
                reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"
                reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"
     */

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnNull() {
        ReverseString emptyString = new ReverseString();
        String reverse = emptyString.reverseString("");
        assertEquals("", reverse);
    }
}
