package Easy;

public class SortZeroOneTwo {
    public int[] sortArray(int[] arr) {
        int[] result = {};
        if (arr == null || arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            result = arr;
        }
        return result;
    }
}
