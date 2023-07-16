package LessThanHundred;

public class LessThanHundred {
    public boolean CheckLessThanHundred(int i, int i1) {
        boolean result = false;
        int sum = i + i1;
        if (sum < 100) {
            result = true;
        }
        return result;
    }
}
