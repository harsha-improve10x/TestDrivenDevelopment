package Easy;

public class NumberAppearsOnce {
    public int countAppears(int[] arr) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            result = 0;
        } else if (arr.length == 1) {
            result = 1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count == 1) {
                    result = arr[i];
                    break;
                }
            }
        }
        return result;
    }
}
