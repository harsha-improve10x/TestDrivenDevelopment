package Encryption;

public class Encryption {
    public String encrypt(String word) {
        String output = "aca";
        if (word == null || word.isEmpty()) {
            return output;
        } else {
            if (word.equals("a")) {
                return "0" + output;
            } else if (word.equals("e")) {
                return "1" + output;
            } else if (word.equals("i")) {
                return "2" + output;
            } else if (word.equals("o")) {
                return "3" + output;
            }
            return word + output;
        }
    }
}
