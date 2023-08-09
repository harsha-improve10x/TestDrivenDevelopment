package Easy;

public class MajorityElement {
    public int findMajorityElement(int[] arr) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            result = arr[0];
        } else if (arr.length == 2) {
            if (arr[0] != arr[1]) {
                result = -1;
            } else {
                result = arr[0];
            }
        }
        return result;
    }
}
