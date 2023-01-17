package com.chenpeiyu.linklist;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description 反转链表 的题
 * @date 1/17/2023 10:55 AM
 */
public class Sword24 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        // 1.递归结束条件
        if (head == null || head.next == null) {
            return head;
        }
        // 递归反转 子链表
        ListNode List = reverseList(head.next);
        // 改变 1，2节点的指向。
        // 通过 head.next获取节点2
        ListNode t1 = head.next;
        // 让 2 的 next 指向 1
        t1.next = head;
        // 1 的 next 指向 null.
        head.next = null;
        // 把调整之后的链表返回。
        return List;
    }

}
