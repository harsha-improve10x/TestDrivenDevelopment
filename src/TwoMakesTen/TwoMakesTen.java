package TwoMakesTen;

public class TwoMakesTen {
    public boolean makesTen(int a, int b) {
        boolean result  = false;
        int sum = a + b;
        if (a == 10 || b == 10 || sum == 10) {
            result = true;
        }
        return result;
    }
}
