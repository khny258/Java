import java.util.*;
class FizzBuzz
{
    public static void main(String args[]) 
    {
        int n = 100;
        
        // loop 100 times
        for (int i=1; i<=n; i++)
        {
            // if divisible by 3 & 5, print 'FizzBuzz' in place of the number
            if (i%15==0)
                System.out.print("FizzBuzz"+" ");
            
            // if divisible 5, print 'Buzz' in place of the number
            else if (i%5==0)
                System.out.print("Buzz"+" ");

            // if divisible 5, print 'Fizz' in place of the number
            else if (i%3==0)
                System.out.print("Fizz"+" ");
            
            // print the numbers
            else
                System.out.print(i+" ");
        }
    }
}