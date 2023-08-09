package Easy;

public class MajorityElement {
    public int findMajorityElement(int[] arr) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            return result;
        } else if (arr.length == 1) {
            result = arr[0];
        } else {
            int n = arr.length/2;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                if (count > n) {
                    result = arr[i];
                }
            }
        }
        return result;
    }
}
