package com.chenpeiyu.slideWindow;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 2/9/2023 11:24 PM
 */
public class L219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        int r = 0;
        //设置一个极端的情况
        int res = nums.length;
        while (l < nums.length - 1) {
            if (r + 1 < nums.length && nums[r + 1] != nums[l]) {
                //扩展窗口的右侧
                r++;
            } else {
                if (r + 1 < nums.length && nums[l] == nums[r + 1]) {
                    //扩展窗口的左侧
                    res = Math.min(res, Math.abs(r + 1 - l));
                }
                l++;
            }

        }
        return res <= k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        boolean duplicate = new L219().containsNearbyDuplicate(nums, 2);
        System.out.println(duplicate);
    }
}
