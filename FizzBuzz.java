class FizzBuzz {
    public static void main (String args[])
    {
        for (int i = 1; i <= 100; i++)
        {
            // if i is divisible by 15 print FizzBuzz
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            // if i is divisible by 5 print Buzz
            else if (i % 5 == 0)
                System.out.println("Buzz");
            // If i is divisible by 3 print Fizz
            else if (i % 3 == 0)
                System.out.println("Fizz");
            // else print i
            else   
                System.out.println(i);
        }
    }
}