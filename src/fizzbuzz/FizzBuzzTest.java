package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void nothing() {
    }

    @Test
    public void checkThreeAndFiveNot() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(23);
        assertEquals("23", result);
    }
   @Test
    public void checkThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(9);
        assertEquals("FIZZ", result);
   }

   @Test
    public void checkFive() {
       FizzBuzz fizzBuzz = new FizzBuzz();
       String result = fizzBuzz.findFizzBuzz(10);
       assertEquals("BUZZ", result);
   }

   @Test
    public void checkThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(15);
        assertEquals("FIZZBUZZ", result);
   }
}
