package AreaOfTriangle;

public class AreaOfTriangle {
    public int findTriArea(int base, int height) {
        int result = 0;
        if (base < 0 || height < 0) {
            result = -1;
        }else if (base == 0 || height == 0) {
            result = 0;
        } else if (base > 0 || height > 0) {
            result = ((base * height)/2);
        }
        return result;
    }
}
