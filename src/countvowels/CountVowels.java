package countvowels;

public class CountVowels {
    public int count(String s) {
        if (s.contains("A")) {
            return 1;
        } else if (s.contains("E")) {
            return 1;
        }
        return 0;
    }
}
