package existAnumberHigher;

public class Higher {
    public boolean existsHigher(int[] arr, int n) {
        boolean result = false;
        if (arr.length == 0) {
            result = false;
        } else {
            for (int i = 0; i<arr.length-1; i++) {
                if (arr[i] >= n) {
                    result = true;
                }
            }
        }
        return result;
    }
}
