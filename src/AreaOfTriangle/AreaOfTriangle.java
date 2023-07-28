package AreaOfTriangle;

public class AreaOfTriangle {
    public int findTriArea(int a, int b) {
        int result = Integer.MIN_VALUE;
        if (a < 0 || b < 0) {
            return result;
        }
        if (a == 0 || b == 0) {
            result = 0;
        }
        return result;
    }
}
