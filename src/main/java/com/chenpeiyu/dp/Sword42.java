package com.chenpeiyu.dp;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 1/18/2023 3:36 PM
 */
public class Sword42 {

    public static void main(String[] args) {

    }
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }

}
