package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void nothing() {
    }

   @Test
    public void checkThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(9);
        assertEquals("FIZZ", result);
   }
}
