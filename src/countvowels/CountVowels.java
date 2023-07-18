package countvowels;

public class CountVowels {
    public int count(String s) {
        int count = 0;
        String str = s.toLowerCase();
        if (s.length() > 0) {
            for (int i = 0; i<str.length(); i++) {
               char ch = str.charAt(i);
               if (ch == 'a' || ch == 'e') {
                   count++;
               }
            }
        }
        return count;
    }
}
