package LargestNumberInAnArray;

public class LargestNumber {
    public int findLargestNumber(int[] arr) {
        int largest = 0;
        if (arr.length == 0) {
            largest = 0;
        } else if (arr.length == 1) {
            largest = arr[0];
        } else if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
        }
        return largest;
    }
}
