package Easy;

public class LongestSubArray {
    public int findLongest(int[] arr, long k) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            result = arr[0];
        } else {
            int length = 0;
            for (int i = 0; i < arr.length; i++) {
                long s = 0;
                for (int j = i; j < arr.length; j++) {
                    s += arr[j];
                    if (s == k) {
                        length = Math.max(length, j - i + 1);
                    }
                }
            }
            result = length;
        }
        return result;
    }
}
