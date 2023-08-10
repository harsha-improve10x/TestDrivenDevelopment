package Easy;

import java.util.ArrayList;

public class LeadersInArray {
    public ArrayList<Integer> leaders(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new ArrayList<>();
        } else if (arr.length == 1) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(arr[0]);
            return arrayList;
        }
        return new ArrayList<>();
    }
}
