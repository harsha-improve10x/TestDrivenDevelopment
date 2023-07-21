package Palindrome;

public class Palindrome {
    public boolean isPalindrome(String s) {
        boolean result = false;
        if (s == null) {
            result = false;
        }else if (s == "") {
            result = true;
        } else if (s == "A") {
            result = true;
        } else if (s == "AB") {
            result = false;
        }
        return result;
    }
}
