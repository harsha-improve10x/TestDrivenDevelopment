package PhoneNumberFormatting;

public class PhoneNumber {
    public String numberFormat(int[] ints) {
        String result = "";
        if (ints.length == 0) {
            result = "(" + ")" + " -";
        }else if (ints.length > 0) {
                result = "(" + ints[0] + ints[1] + ints[2] + ")" + ints[3] + ints[4]
                        + ints[5]  + "-" + ints[6] + ints[7] + ints[8] + ints[9];
            }
        return result;
    }
}
