package Encryption;

public class Encryption {
    public String encrypt(String word) {
        String output = "aca";
        if (word == null || word.isEmpty()) {
            return output;
        } else {
            if (word.contains("a")) {
                return "0" + output;
            } else if (word.contains("e")) {
                return "1" + output;
            }
            return word + output;
        }
    }
}
