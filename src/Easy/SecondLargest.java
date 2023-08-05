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
        } else {
            int largest = arr[0];
            secondLargest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }
        }
        return secondLargest;
    }
}
