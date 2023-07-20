package PhoneNumberFormatting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneTest {
    private PhoneNumber phoneNumber;
    /*
    Problem: Create a method that takes an array of 10 integers (between 0 and 9) and
    returns a string of those numbers formatted as a phone number (e.g. (555) 555-5555).
    Examples:   formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) ➞ "(123) 456-7890"
                formatPhoneNumber([5, 1, 9, 5, 5, 5, 4, 4, 6, 8]) ➞ "(519) 555-4468"
                formatPhoneNumber([3, 4, 5, 5, 0, 1, 2, 5, 2, 7]) ➞ "(345) 501-2527"
     */

    @Test
    public void nothing() {
    }

    @BeforeEach
    public void setup() {
        phoneNumber = new PhoneNumber();
    }

    @Test
    public void givenNull_returnNull() {
        String result = phoneNumber.numberFormat(new int[]{});
        assertEquals("() -", result);
    }

    @Test
    public void givenOne_returnOne() {
        String result = phoneNumber.numberFormat(new int[]{1});
        assertEquals("(1)-", result);
    }

    @Test
    public void givenOneTwoThreeFour_returnFormat() {
        String result = phoneNumber.numberFormat(new int[]{1, 2, 3, 4});
        assertEquals("(123)4-", result);
    }

    @Test
    public void givenNumbers_returnformat() {
        String result = phoneNumber.numberFormat(new int[]{1, 2, 3, 3, 5, 6, 7, 8, 9, 4});
        assertEquals("(123)356-7894", result);
    }

    @Test
    public void givenOneTwoThree_returnOneTwoThree() {
        String result = phoneNumber.numberFormat(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9});
        assertEquals("(123)456-7899", result);
    }
}
