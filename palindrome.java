import java.util.Stack;

public class PrintPalindrom {
    public static void main(final String[] args) {
        final int MIN = 10;
        final int MAX = 99;
        for (int i = MIN; i <= MAX; i++) {
            for (int j = MIN ; j <= MAX; j++) {
                new PrintPalindrom(i, j);
            }
        }
    }

    public PrintPalindrom(final int a, final int b) {
        if (a >= 10 &&  a <= 99 && b >= 10 && b <= 99) {
            final String result = String.valueOf(a * b);    // Convert the product of the int to a String
            final Stack<String> stack = new Stack<String>();

            System.out.print(a + " * " + b + " = " + result + "\t-\t");

            // Push each character from the in to a stack
            for(int n = 0; n < result.length(); n++) {
                stack.push(result.substring(n, n + 1));
            }

            // Check each character against the characters in the stack
            for(int n = 0; n < result.length(); n++) {
                if(!result.substring(n, n + 1).equals(stack.pop())) {
                    System.out.println("Not a palindrom");
                    return;
                }
            }
        }

        System.out.println("A palindrom");
    }
}