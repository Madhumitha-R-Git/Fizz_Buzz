import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Nested
    public class FizzBuzzCheck1
    {
        @Test
        void toFindAMultipleOfThreeNumberIsFizz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(9);
            String expectednumber = "Fizz";
            String calculatednumber = fizzbuzznumber.fizzCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindANonMultipleOfThreeNumberIsFizz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(26);
            String expectednumber = "No it is not a Fizz number";
            String calculatednumber = fizzbuzznumber.fizzCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindAMultipleOfFiveNumberIsBuzz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(95);
            String expectednumber = "Buzz";
            String calculatednumber = fizzbuzznumber.buzzCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindANonMultipleOfFiveNumberIsBuzz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(59);
            String expectednumber = "No it is not a Buzz number";
            String calculatednumber = fizzbuzznumber.buzzCheck();
            assertEquals(expectednumber,calculatednumber);
        }

    }

}
