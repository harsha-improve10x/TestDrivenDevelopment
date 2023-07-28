package AreaOfTriangle;

public class AreaOfTriangle {
    public int findTriArea(int base, int height) {
        int area = 0;
        if (base < 0 || height < 0) {
            area = -1;
        }else if (base == 0 || height == 0) {
            area = 0;
        } else if (base > 0 || height > 0) {
            area = ((base * height)/2);
        }
        return area;
    }
}
