package com.chenpeiyu.linklist;

import com.chenpeiyu.linklist.ListNode;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 1/16/2023 9:39 PM
 */
public class Sword25 {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //创建一个新的链表
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        dummy.next = null;
        //开始比较，边比较边逐一加入
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                curr.next = l1 ;
                curr = curr.next;
                //更新位置
                l1 = l1.next;
            }else {
                //更新位置
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }
        //将其中一个还没走到低的链表所有剩下的节点全部加入到l3当中
        if (l1 != null){
            curr.next = l1 ;
            curr = curr.next;
            l1 = l1.next;
        }

        if (l2 != null){
            curr.next = l2 ;
            curr = curr.next;
            l1 = l2.next;
        }

        return dummy.next;
    }
}
