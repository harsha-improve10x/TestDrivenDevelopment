package convertminutesintoseconds;

public class MinutesToSeconds {
    public int convert(int n) {
        int result = 0;
        if (n > 0) {
            result = n * 60;
        }
        return result;
    }
}
