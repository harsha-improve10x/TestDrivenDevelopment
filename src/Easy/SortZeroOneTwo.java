package Easy;

public class SortZeroOneTwo {
    public int[] sortArray(int[] arr) {
        int[] result = {};
        if (arr == null || arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            result = arr;
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
            result =  arr;
        }
        return result;
    }
}
