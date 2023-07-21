package Palindrome;

public class Palindrome {
    public boolean isPalindrome(String s) {
        boolean result = false;
        if (s == null) {
            result = false;
        }else if (s == "") {
            result = true;
        } else {
            StringBuilder stringBuilder = new StringBuilder(s);
            String reverse = stringBuilder.reverse().toString();
            if (s.equalsIgnoreCase(reverse)) {
                result =  true;
            }
        }
        return result;
    }
}
