package ConvertAgeToDays;

public class AgeToDays {
    public int convert(int age) {
        int days = 0;
        if (age > 0) {
            days = age * 365;
        }
        return days;
    }
}
