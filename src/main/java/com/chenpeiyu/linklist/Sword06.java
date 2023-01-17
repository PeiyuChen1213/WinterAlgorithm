package com.chenpeiyu.linklist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 1/16/2023 10:38 PM
 */
public class Sword06 {

    public static void main(String[] args) {

    }

    ArrayList<Integer> tmp = new ArrayList<Integer>();

    public int[] reversePrint(ListNode head) {
        recur(head);
        //拿到返回的链表之后直接 将其转成数组
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }
    //递归的方式解决这个问题，递归的出口是 head == null
    // 不断深入，知道到达出口
    // 到达出口之后，会逆序输出，这个时候将输出的结果装到链表当中
    void recur(ListNode head) {
        if (head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }
}
