package FindDifferenceMaximumAndMinimumArrays;

public class Difference {
    public int findDiff(int[] arr) {
        int result = 0;
        int max = 0;
        int min = 0;
        if (arr.length==1) {
            result = arr[0];
        } else if (arr.length==2) {
            max = arr[0];
            min = arr[0];
            for (int i=1; i<arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    result = max - min;
                } else{
                    min = arr[i];
                    result = max - min;
                }
            }
        }
        return result;
    }
}
