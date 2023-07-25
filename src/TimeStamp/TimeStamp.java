package TimeStamp;

import java.time.Instant;
import java.util.Date;

public class TimeStamp {

    public static void main(String[] args) {
        Date date = new Date();
        long l = date.getTime();
        System.out.println(l);
    }
    public String getDisplayDate(long timeStampInMillis) {
        return "";
    }
}
