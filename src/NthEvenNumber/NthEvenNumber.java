package NthEvenNumber;

public class NthEvenNumber {
    public int even(int n) {
        int result = -1;
        if (n == 0) {
            result = 0;
        } else if (n > 0) {
            result = 2 * (n-1);
        }
        return result;
    }
}
