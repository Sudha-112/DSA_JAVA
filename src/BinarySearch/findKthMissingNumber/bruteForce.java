package BinarySearch.findKthMissingNumber;

public class bruteForce {

    public static int findKthMissing(int[] arr, int k) {
        int n = arr.length;
        int missingCount = 0;
        int number = 1;
        int i = 0; // pointer for array

        while (true) {
            // agar current array element == number, matlab number present hai
            if (i < n && arr[i] == number) {
                i++;
            } else {
                // number missing hai
                missingCount++;
                if (missingCount == k) {
                    return number;
                }
            }
            number++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        int ans = findKthMissing(arr, k);
        System.out.println("Kth Missing Number: " + ans);
    }
}
//time complexity = O(n+k)
//space complexity = O(1)