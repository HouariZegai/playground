package org.zegai.leetcode.easy;

import org.zegai.leetcode.util.ArrayUtil;

public class TwoSum {

    public static void main(String[] args) {
        new ArrayUtil<>().print(new TwoSum().twoSum(new int[]{2,7,11,15}, 9));
        new ArrayUtil<>().print(new TwoSum().twoSum(new int[]{3,2,4}, 6));
        new ArrayUtil<>().print(new TwoSum().twoSum(new int[]{3,3}, 6));
        new ArrayUtil<>().print(new TwoSum().twoSum(new int[]{3,3}, 6));
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
