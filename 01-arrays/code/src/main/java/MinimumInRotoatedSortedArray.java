/* https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/ */
public class MinimumInRotoatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
    }

    // as array is sorted hence used binary search
    static public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 1) {
            return nums[start];
        }
        if (nums[start] < nums[end]) {
            return nums[start];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
