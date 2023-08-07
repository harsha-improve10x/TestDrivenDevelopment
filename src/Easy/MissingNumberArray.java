package Easy;

public class MissingNumberArray {
    public int findMissingNumber(int[] arr, int n){
        int result = 0;
        if (arr == null || arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            result = 1;
        }
        return result;
    }
}
