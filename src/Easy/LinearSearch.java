package Easy;

public class LinearSearch {
    public int findNumber(int[] arr, int num) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            return  result;
        } else if (arr.length == 1) {
            result = 0;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    result = i;
                }
            }
        }
        return result;
    }
}
