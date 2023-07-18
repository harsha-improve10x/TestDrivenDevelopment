package rotateclockwise;

public class RotateClockWise {
    public int[] rotate(int[] arr) {
        int[] num = {};
        if (arr.length > 0) {
            num = new int[]{arr.length};
            num[0] = arr[arr.length-1];
            for (int i = arr.length; i<arr.length; i--) {
                num[i] = arr[i-1];
            }
        }
        return num;
    }
}
