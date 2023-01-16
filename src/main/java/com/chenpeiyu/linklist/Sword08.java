package com.chenpeiyu.linklist;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 1/16/2023 8:52 PM
 */
public class Sword08 {
    public static void main(String[] args) {

    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = dummy.next;

        while (curr != null) {
            if (curr.val == val){
                pre.next = curr.next;
            }
            pre = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}
