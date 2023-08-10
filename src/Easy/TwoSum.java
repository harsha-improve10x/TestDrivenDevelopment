package Easy;

public class TwoSum {
    public String findSum(int[] arr, int targetElement) {
        String result = "No";
        if (arr == null || arr.length == 0) {
            result = "No";
        } else if (arr.length == 1) {
            if (arr[0] == targetElement) {
                result = "Yes";
            }
        }
        return result;
    }
}
