package Easy;

public class SortArray {
    public boolean isArraySorted(int[] arr) {
        boolean result = false;
        if (arr == null) {
            result = false;
        } else if (arr.length == 0) {
            result = true;
        } else if (arr.length == 1) {
            result = true;
        }
        return result;
    }
}
