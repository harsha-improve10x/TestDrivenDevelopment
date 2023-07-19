package HowMuchIsTrue;

public class HowMuchIsTrue {
    public int countTrue(String[] string) {
        int count = 0;
        if (string.length > 0) {
            for (int i = 0; i < string.length; i++) {
                if (string[i].equalsIgnoreCase("true")) {
                    count++;
                }
            }
        }
        return count;
    }
}
