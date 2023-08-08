package Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public ArrayList<Integer> makeUnion(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return new ArrayList<>();
        } else {
            ArrayList<Integer> unionList = new ArrayList();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < arr1.length; i++) {
                set.add(arr1[i]);
            }
            for (int i = 0; i < arr2.length; i++) {
                set.add(arr2[i]);
            }
            for (int a : set) {
                unionList.add(a);
            }
            return unionList;
        }
    }
}
