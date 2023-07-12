package threeprogrammers;

public class ThreeProgrammers {
    public int findDifference(int i, int i1, int i2) {
        int diff = 0;
        int a1 = Math.max(i, i1);
        int a2 = Math.max(a1, i2);
        int b1 = Math.min(i, i1);
        int b2 = Math.min(b1, i2);
        diff = a2 - b2;
        return diff;

    }
}
