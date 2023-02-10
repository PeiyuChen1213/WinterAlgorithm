package com.chenpeiyu.slideWindow;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 2/9/2023 7:55 AM
 */
public class L209 {
    public class Solution {
        public static int minSubArrayLen(int target, int[] nums) {
            int l = 0;
            int r = -1;
            //设置初始的窗口大小
            int res = nums.length + 1;
            int sum = 0;
            while (l < nums.length) {
                //计算当前窗口当中的总和
                //大于target 说明是一个合理的答案
                if (sum < target && r + 1 < nums.length) {
                    r++;
                    sum += nums[r];
                } else {
                    //或者r走到尽头
                    sum -= nums[l];
                    l++;
                }
                // 更新答案
                if (sum>target) {
                    res = Math.min(res, r - l + 1);
                }
            }
            return res;
        }

    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int res = Solution.minSubArrayLen(7, nums);
        System.out.println(res);
    }
}
