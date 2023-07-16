package HoursAndMinutesToSeconds;

public class TimeConvertor {
    public int convert(int hour, int min) {
        int seconds = 0;
        if (hour == 0 && min == 0) {
            seconds = 0;
        } else {
            seconds = (hour * 60 + min) * 60;
        }
        return seconds;
    }
}
