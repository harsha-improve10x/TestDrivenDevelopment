package IntegerInRange;

public class IntegerInRange {
    public boolean intWithinBounds(int i, int i1, int i2) {
        boolean result = false;
        if (i >= i1 && i < i2) {
            result = true;
        }
        return result;
    }
}
