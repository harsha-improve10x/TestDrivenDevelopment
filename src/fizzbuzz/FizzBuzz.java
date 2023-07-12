package fizzbuzz;

public class FizzBuzz {

        public String findFizzBuzz(int n) {
        String result = "";
        if (n % 3 == 0) {
            result = "FIZZ";
        }
        return result;
    }
}
