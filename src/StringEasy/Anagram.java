package StringEasy;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String str1, String str2) {
        boolean result = false;
        if (str1 == "" && str2 == "") {
            result = true;
        } else if (str1 == "" || str2 == "") {
            result = false;
        } else {
            String s1 = str1.toLowerCase();
            String s2 = str2.toLowerCase();
            if (s1.length() != s2.length()) {
                result = true;
            } else {
                char[] a = s1.toCharArray();
                char[] b = s2.toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                if (Arrays.equals(a, b) == true) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
