package EqualityOfThreeValues;

public class Equality {
    public int equal(int a, int b, int c) {
        int result = 0;
        if (a == b || b == c || a == c) {
            result = 2;
        }
        return result;
    }
}
