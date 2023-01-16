package com.chenpeiyu.linklist;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 1/16/2023 9:22 PM
 */
public class Sword22 {
    public static void main(String[] args) {


    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        //定义两个指针
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast!=null){
            //两个指针都在往前走
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
