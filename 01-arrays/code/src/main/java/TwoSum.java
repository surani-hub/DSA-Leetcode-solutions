import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/* https://leetcode.com/problems/two-sum/description/ */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(sum(nums, target)));
    }

    // using HashMap TC O(n)
    static public int[] sum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    // using two pointer approach TC:O(nlogn)
    static public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if ((nums[start] + nums[end]) > target) {
                end--;
            }
            if ((nums[start] + nums[end]) < target) {
                start++;
            } else {
                return new int[]{start, end};
            }
        }
        return new int[]{-1, -1};
    }

    // brute force approach TC: O(n^2)
    public int[] twoSum1(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}
