package Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public ArrayList<Integer> makeUnion(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return new ArrayList<>();
        } else if (arr1 == null && arr2 != null) {
            ArrayList<Integer> list = new ArrayList<>();
            HashSet<Integer> integerHashSet = new HashSet<>();
            for (int i = 0; i < arr2.length; i++) {
                integerHashSet.add(arr2[i]);
            }
            for (int a2 : integerHashSet) {
                list.add(a2);
            }
            return list;
        }else if (arr1 !=null  && arr2 == null) {
            ArrayList<Integer> list2 = new ArrayList<>();
            HashSet<Integer> integerHashSet1 = new HashSet<>();
            for (int i = 0; i < arr1.length; i++) {
                integerHashSet1.add(arr1[i]);
            }
            for (int a2 : integerHashSet1) {
                list2.add(a2);
            }
            return list2;
        }else {
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
