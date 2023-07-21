package Palindrome;

public class Palindrome {
    public boolean isPalindrome(String s) {
        boolean result = false;
        if (s == null) {
            result = false;
        }else if (s.contains("")) {
            result = true;
        }
        return result;
    }
}
