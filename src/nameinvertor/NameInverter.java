package nameinvertor;

import java.util.Locale;

public class NameInverter {
    public String invertName(String s) {
        String name = s.toLowerCase();
        if (name.equals("")) {
            return "";
        } else if (!name.trim().contains(" ")) {
            return name.trim();
        } else {
            String[] names = name.trim().split("\\s+");
            return names[1] +", "+names[0];
        }
    }
}
