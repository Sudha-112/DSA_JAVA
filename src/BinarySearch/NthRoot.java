package BinarySearch;

public class NthRoot {

    public static int NthSqrt(int m, int n){

        // Function to find N-th root of M using binary search
                // Set low and high for binary search
                int low = 1, high = m;
                int sqrt = 0;

                // Start binary search
                while (low <= high) {
                    // Calculate mid
                    int mid = (low + high) / 2;

                    long ans = 1;
                    for (int i = 0; i < n; i++) {
                        ans *= mid;
                        if (ans > m) break;
                    }

                    // If mid^n equals and less than m
                    if (ans <= m) {
                        sqrt = mid;
                        low = mid + 1;
                    }

                        // If mid^n is more than m
                    else high = mid - 1;
                }

                // Return -1 if not found
                if(sqrt == 1)return -1;
                else return sqrt;
            }




    public static void main(String [] args){
        int m = 64;
        int n = 8;

        int ans = NthSqrt(m,n);
        System.out.println(ans);
    }
}
