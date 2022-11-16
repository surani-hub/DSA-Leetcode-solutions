public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5};
        int k = 2;
        System.out.println(findMaxSum(arr, k));
    }

    static public int findMaxSum(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}
