package Easy;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public int[] remove(int[] arr) {
        int[] result = {0};
        if (arr == null) {
           return result;
        } else if (arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            return arr;
        } else {
            result = Arrays.stream(arr).distinct().toArray();
            return result;
        }
    }
}
