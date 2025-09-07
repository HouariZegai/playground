package org.zegai.leetcode.easy;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1}));
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1,1,2}));
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
