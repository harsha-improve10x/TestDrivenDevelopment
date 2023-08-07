package Easy;

public class MaximumConsecutiveOne {
    public int maximum(int[] arr) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            result =  arr[0];
        } else {
            int max = 0;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    count++;
                }else {
                    count = 0;
                }
                max = Math.max(count, max);
            }
            result = max;
        }
        return result;
    }
}
