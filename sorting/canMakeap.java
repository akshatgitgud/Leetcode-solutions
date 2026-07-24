package sorting;
// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

import java.util.Arrays;

public class canMakeap {
    public static void main(String[] args) {
        
    }
    public boolean canMakeArithmeticProgression(int[] nums) {
        Arrays.sort(nums);
        int diff=nums[1]-nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]!=diff) return false;
        }
    return true;
    }
}