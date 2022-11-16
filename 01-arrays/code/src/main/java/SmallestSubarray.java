public class SmallestSubarray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 1, 6};
        int s = 8;
        System.out.println(findMinSum(arr, s));
    }

    static public int findMinSum(int[] arr, int s) {
        int minLength = Integer.MAX_VALUE;
        int k = 0, windowSum = 0;
        for(int i=0;i<arr.length;i++){
            windowSum += arr[i];
            while(windowSum >= s){
                minLength = Math.min(minLength, i-k+1);
                windowSum -=arr[k];
                k++;
            }
        }
        return  minLength;
    }


}
