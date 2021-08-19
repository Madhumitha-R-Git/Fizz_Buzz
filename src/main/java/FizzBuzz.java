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

    public String fizzAnotherCheck() {
        if(num%3==0)
            return "Fizz";
        else  {
            while(num>0)
            {
                if(num%10==3)
                    return"Fizz";
                num=num/10;
            }

        }
        return "It is not a Fizz number";
    }

    public String buzzAnotherCheck() {
        if(num%5==0)
            return "Buzz";
        else  {
            while(num>0)
            {
                if(num%10==5)
                    return"Buzz";
                num=num/10;
            }

        }
        return "It is not a Buzz number";
    }

    public String fizzbuzzCheck() {
        if(num%3==0 && num%5==0)
            return "FizzBuzz";
        return "It is not a FizzBuzz";
    }
}
