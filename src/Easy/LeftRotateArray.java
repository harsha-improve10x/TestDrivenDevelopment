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
        }
        return result;
    }
}
