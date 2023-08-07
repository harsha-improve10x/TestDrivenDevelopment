package Easy;

public class LeftRotateArray {
    public int[] rotate(int[] arr) {
        int[] result = {0};
        if (arr == null) {
            return result;
        } else if (arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            return arr;
        } else {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = temp;
        }
        return arr;
    }
}
