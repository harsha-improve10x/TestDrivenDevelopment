package rotateclockwise;

public class RotateClockWise {
    public int[] rotate(int[] arr) {
        if (arr.length > 0) {
            int lastNumber = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = lastNumber;
        }
        return arr;
    }
}
