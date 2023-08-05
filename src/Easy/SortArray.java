package Easy;

public class SortArray {
    public boolean isArraySorted(int[] arr) {
        boolean result = false;
        if (arr == null) {
            result = false;
        } else if (arr.length == 0) {
            result = true;
        } else if (arr.length == 1) {
            result = true;
        } else {
            int[] sort = {};
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length-i; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        sort = arr;
                    }
                    if (sort.equals(arr)) {
                        result = true;
                    } else {
                        result = false;
                    }
                }
            }
        }
        return result;
    }
}
