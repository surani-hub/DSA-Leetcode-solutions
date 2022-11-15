import java.util.HashSet;
import java.util.Set;

/* https://leetcode.com/problems/contains-duplicate/description/ */
public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums));
    }

    // brute force approach TC:O(n^2)
    static public boolean containsDuplicates(int[] nums) {
        boolean status = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    status = true;
                    break;
                }
            }
        }
        return status;
    }

    // optimised using HashSet TC: O(n)
    static public boolean containsDuplicate(int[] nums) {
        boolean status = false;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                status = true;
                break;
            }
        }
        return status;
    }
}
