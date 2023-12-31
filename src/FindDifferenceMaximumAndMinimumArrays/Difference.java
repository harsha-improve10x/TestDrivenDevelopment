package FindDifferenceMaximumAndMinimumArrays;

public class Difference {
    public int findDiff(int[] arr) {
        int result = 0;
        if (arr.length == 0) {
            result = 0;
        } else if (arr.length==1) {
            result = arr[0];
        } else {
            int max = arr[0];
            int min = arr[0];
            for (int i=1; i<arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                } else if (arr[i] < min){
                    min = arr[i];
                }
            }
            result = max - min;
        }
        return result;
    }
}
