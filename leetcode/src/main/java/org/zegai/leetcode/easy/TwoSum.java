package org.zegai.leetcode.easy;

import org.zegai.leetcode.util.ArrayUtil;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        new ArrayUtil<>().print(new TwoSum().twoSum(new int[]{2,7,11,15}, 9));
        new ArrayUtil<>().print(new TwoSum().twoSum(new int[]{3,2,4}, 6));
        new ArrayUtil<>().print(new TwoSum().twoSum(new int[]{3,3}, 6));
        new ArrayUtil<>().print(new TwoSum().twoSum(new int[]{3,3}, 6));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
