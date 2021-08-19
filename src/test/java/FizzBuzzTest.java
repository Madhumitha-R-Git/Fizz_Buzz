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

    @Nested
    public class FizzBuzzCheck2
    {
        @Test
        void toFindAMultipleOfThreeNumberHavingThreeInItIsFizz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(33);
            String expectednumber = "Fizz";
            String calculatednumber = fizzbuzznumber.fizzAnotherCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindANonMultipleNumberOfThreeDoesNotHavingThreeInItIsFizz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(44);
            String expectednumber = "It is not a Fizz number";
            String calculatednumber = fizzbuzznumber.fizzAnotherCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindAMultipleOfThreeNumberDoesNotHavingThreeInItIsFizz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(27);
            String expectednumber = "Fizz";
            String calculatednumber = fizzbuzznumber.fizzAnotherCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindANonMultipleOfThreeNumberHavingThreeInItIsFizz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(53);
            String expectednumber = "Fizz";
            String calculatednumber = fizzbuzznumber.fizzAnotherCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindAMultipleOfFiveNumberHavingFiveInItIsBuzz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(45);
            String expectednumber = "Buzz";
            String calculatednumber = fizzbuzznumber.buzzAnotherCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindANonMultipleNumberOfFiveDoesNotHavingFiveInItIsBuzz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(44);
            String expectednumber = "It is not a Buzz number";
            String calculatednumber = fizzbuzznumber.buzzAnotherCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindAMultipleOfFiveNumberDoesNotHavingFiveInItIsBuzz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(20);
            String expectednumber = "Buzz";
            String calculatednumber = fizzbuzznumber.buzzAnotherCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindANonMultipleOfFiveNumberHavingFiveInItIsBuzz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(54);
            String expectednumber = "Buzz";
            String calculatednumber = fizzbuzznumber.buzzAnotherCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindANumberIsFizzBuzz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(60);
            String expectednumber = "FizzBuzz";
            String calculatednumber = fizzbuzznumber.fizzbuzzCheck();
            assertEquals(expectednumber,calculatednumber);
        }

        @Test
        void toFindANumberIsNotAFizzBuzz()
        {
            FizzBuzz fizzbuzznumber = new FizzBuzz(58);
            String expectednumber = "It is not a FizzBuzz";
            String calculatednumber = fizzbuzznumber.fizzbuzzCheck();
            assertEquals(expectednumber,calculatednumber);
        }
    }
}
