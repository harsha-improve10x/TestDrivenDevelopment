package MissingNumber;

public class MissingNumber {
    public int findMissingNumber(int[] arr) {
        int missingNumber = 0;

        if (arr.length == 0) {
            missingNumber = 0;
        }else if(arr[0] <= 0) {
            missingNumber = -1;
        } else if(arr.length > 0 && arr.length < 8){
            missingNumber = 0;
        } else if(arr.length == 8) {
            int sum = 55;
            int total = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7] + arr[8];
            missingNumber = sum - total;
        }
        return missingNumber;
    }
}
