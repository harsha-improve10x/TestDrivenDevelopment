package AreaOfTriangle;

public class AreaOfTriangle {
    public int findTriArea(int a, int b) {
        int result = 0;
        if (a < 0 || b < 0) {
            result = -1;
        }else if (a == 0 || b == 0) {
            result = 0;
        } else if (a > 0 || b > 0) {
            result = ((a * b)/2);
        }
        return result;
    }
}
