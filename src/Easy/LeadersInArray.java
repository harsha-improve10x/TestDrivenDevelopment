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
        } else {
            ArrayList<Integer> integerArrayList = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                boolean leader = true;
                for (int j = i + 1; j < arr.length; j++)
                    if (arr[j] > arr[i]) {
                        leader = false;
                        break;
                    }
                if (leader) {
                    integerArrayList.add(arr[i]);
                }
            }
            return integerArrayList;

        }
    }
}
