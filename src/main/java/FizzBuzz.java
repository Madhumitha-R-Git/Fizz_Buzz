public class FizzBuzz {
    int num;

    FizzBuzz(int num)
    {
        this.num = num;
    }

    public String fizzCheck() {
        if(num%3==0)
            return "Fizz";
        else
            return "No it is not a Fizz number";
    }

    public String buzzCheck() {
        if(num%5==0)
            return "Buzz";
        else
            return "No it is not a Buzz number";
    }
}
