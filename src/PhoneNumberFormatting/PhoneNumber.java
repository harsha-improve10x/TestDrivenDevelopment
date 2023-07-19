package PhoneNumberFormatting;

public class PhoneNumber {
    public String numberFormat(int[] ints) {
        String result = "";
        if (ints.length > 0) {
            result = String.valueOf(ints[0]);
        }
        return result;
    }
}
