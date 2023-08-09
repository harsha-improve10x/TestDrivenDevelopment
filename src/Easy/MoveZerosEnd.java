package Easy;

import java.util.ArrayList;

public class MoveZerosEnd {
    public int[] move(int[] arr) {
        int[] result = {};
        if (arr == null || arr.length == 0) {
            return  result;
        } else if (arr.length == 1) {
            return arr;
        } else {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arrayList.add(arr[i]);
                }
            }
            int n = arrayList.size();
            for (int i = 0; i <n; i++) {
                arr[i] = arrayList.get(i);
            }
            for (int i = n; i<arr.length; i++) {
                arr[i] = 0;
            }
            return arr;
        }
    }
}
