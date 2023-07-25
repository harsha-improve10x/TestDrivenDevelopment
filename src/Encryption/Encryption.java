package Encryption;

public class Encryption {
    public String encrypt(String word) {
        String output = "aca";
        if (word == null || word.isEmpty()) {
            return output;
        }
        return word + output;
    }
}
