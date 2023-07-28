package isRightAngledTriangle;

public class RightAngleTriangle {
    public boolean isRightTriangle(int a, int b, int c) {
        boolean result = false;
        if (a > 0 && b > 0 && c > 0) {
            int opp = a * a;
            int adj = b * b;
            int hyp = c * c;
            if (hyp == opp + adj) {
                result = true;
            }
        }
        return result;
    }
}
