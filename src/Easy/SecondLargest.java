package Easy;

public class SecondLargest {
    public int findSecondLargest(int[] arr) {
        int secondLargest = 0;
        if (arr == null) {
            secondLargest = 0;
        } else if (arr.length == 0) {
            secondLargest = 0;
        } else if (arr.length == 1) {
            secondLargest = Integer.MIN_VALUE;
        }
        return secondLargest;
    }
}
