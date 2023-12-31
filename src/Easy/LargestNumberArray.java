package Easy;

public class LargestNumberArray {
    public int findLargest(int[] arr) {
        int largest = 0;
        if (arr == null) {
            largest = 0;
        }else if (arr.length == 0) {
            largest = 0;
        } else if (arr.length == 1) {
            largest = arr[0];
        } else {
            largest = arr[0];
            for (int i = 1; i<arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
        }
        return largest;
    }
}
