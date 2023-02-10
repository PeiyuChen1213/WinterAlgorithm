package com.chenpeiyu.slideWindow;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 2/9/2023 9:43 PM
 */
public class L3 {

    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = -1;
        //记录结果的
        int res = 0;
        int[] dup = new int[256];
        for (int i = 0; i < dup.length; i++) {
            //初始化用于记录的数组
            dup[i] = 0;
        }
        while (l < s.length()) {
            //右侧没有重复扩展右侧的窗口
            if (r + 1 < s.length() && dup[s.charAt(r + 1)] == 0) {
                r++;
                //记录扩展的字串
                dup[s.charAt(r)]++;
            } else {
                // 右侧已经到头的情况下 或者出现重复
                dup[s.charAt(l)]--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new L3().lengthOfLongestSubstring(s));

    }

}
