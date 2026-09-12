package Recursion;

public class countGoodNumbers {

    static final int MOD = 1_000_000_007;
    static int callCount = 0;

    // Fast exponentiation: x^n mod MOD
    // Even n -> base square karo, exponent half karo
    // Odd n  -> ek baar x multiply karo, exponent 1 kam karo
    private static long power(long x, long n) {
        callCount++;

        // Base case: kuch bhi ki power 0 = 1
        if (n == 0) return 1;

        // Base case: kuch bhi ki power 1 = khud
        if (n == 1) return x % MOD;

        // Agar n even hai
        if (n % 2 == 0) {
            return power((x * x) % MOD, n / 2);
        }
        // Agar n odd hai
        else {
            return (x * power(x, n - 1)) % MOD;
        }
    }

    // Main logic: even indices (0,2,4...) ke liye 5 choices, odd indices ke liye 4 choices
    public static int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;   // total even index positions
        long oddCount = n / 2;          // total odd index positions

        long evenWays = power(5, evenCount);
        long oddWays = power(4, oddCount);

        long ans = (evenWays * oddWays) % MOD;
        return (int) ans;
    }



    public static void main(String[] args) {
        long n = 8;   // yahan value badal kar test karo

        callCount = 0;
        int answer = countGoodNumbers(n);

        System.out.println("n = " + n);
        System.out.println("Total Good Numbers = " + answer);
        System.out.println("Total power() calls made = " + callCount);
    }
}

//time complexity = O(logn)
//space complexity =O(logn)