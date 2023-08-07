package Easy;

public class LinearSearch {
    public int findNumber(int[] arr) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            return  result;
        } else if (arr.length == 1) {
            result = arr[0];
        }
        return result;
    }
}
