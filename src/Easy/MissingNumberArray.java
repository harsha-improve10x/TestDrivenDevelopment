package Easy;

public class MissingNumberArray {
    public int findMissingNumber(int[] arr, int n){
        int result = 0;
        if (arr == null || arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            result = 1;
        } else {
            int missingNumber = n * (n+1)/2;
            int number = 0;
            for (int i = 0; i < n-1; i++) {
                number += arr[i];
            }
            result = missingNumber - number;
        }
        return result;
    }
}
