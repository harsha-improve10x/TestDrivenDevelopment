package Easy;

public class NumberAppearsOnce {
    public int countAppears(int[] arr) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            result = 0;
        } else if (arr.length == 1) {
            result = 1;
        }
        return result;
    }
}
