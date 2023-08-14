package Easy;

import java.util.ArrayList;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeElements(int[] arr) {
        int[] a = {};
        if (arr == null || arr.length == 0) {
            return a;
        } else if (arr.length == 1) {
            return arr;
        } else {
            ArrayList<Integer> pos = new ArrayList<>();
            ArrayList<Integer> neg = new ArrayList<>();
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > 0) {
                    pos.add(arr[i]);
                } else {
                    neg.add(arr[i]);
                }
            }
            for(int i=0;i < arr.length/2-1; i++) {
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            return arr;
        }
    }
}
