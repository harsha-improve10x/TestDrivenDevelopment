package StringEndsWithSubString;

public class Substring {


    public boolean checkEnding(String s1, String s2) {
        boolean result = false;
        if (s1 == "" || s2 == "") {
            result = false;
        } else if (s1 == null || s2 == null) {
            result = false;
        } else if (s1.endsWith(s2.toLowerCase())) {
            result = true;
        }
        return result;
    }
}
