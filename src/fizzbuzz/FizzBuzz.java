package fizzbuzz;

public class FizzBuzz {

        public String findFizzBuzz(int n) {
        String result = String.valueOf(n);
        if (n%3 == 0 && n%5==0) {
            result = "FIZZBUZZ";
        }else if(n % 3 == 0) {
            result = "FIZZ";
        } else if (n %5==0) {
            result = "BUZZ";
        }
            return result;
    }
}
