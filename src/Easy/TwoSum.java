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
        } else {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    sum = arr[i] + arr[j];
                    if (sum == targetElement) {
                        result = "Yes";
                    }
                }
            }

        }
        return result;
    }
}
