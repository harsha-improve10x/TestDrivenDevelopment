package Encryption;

public class Encryption {
    public String encrypt(String word) {
        String output = "";
        String reverse = "";
        if (word == null || word.isEmpty()) {
            return output + "aca";
        } else {
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            char[] replacedVowels = new char[reverse.length()];
            for (int i = 0; i < reverse.length(); i++) {
                char ch = reverse.charAt(i);
                switch (ch) {
                    case 'a':
                        replacedVowels[i] = '0';
                        break;
                    case 'e':
                        replacedVowels[i] = '1';
                        break;
                    case 'i':
                        replacedVowels[i] = '2';
                        break;
                    case 'o':
                        replacedVowels[i] = '3';
                        break;
                    case 'u':
                        replacedVowels[i] = '4';
                        break;
                    default:
                        replacedVowels[i] = ch;
                }
            }
            String replace = new String(replacedVowels);
            output = replace + "aca";
            return output;
        }
    }
}
