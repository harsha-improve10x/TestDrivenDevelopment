package Easy;

public class LongestSubArray {
    public int findLongest(int[] arr, int k) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            result = arr[0];
        }
        return result;
    }
}
