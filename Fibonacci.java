public class Solution {
    public int fib(int N) {
        // if N is smaller or equal to 1, return 1
        if (N <= 1) {
            return N;
        }

        // else fibonacci sequence
        return fib(N - 1) + fib(N - 2);
    }
}