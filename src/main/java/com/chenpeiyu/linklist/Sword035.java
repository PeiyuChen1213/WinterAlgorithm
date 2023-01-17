package com.chenpeiyu.linklist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chen Peiyu
 * @version 1.0
 * @description TODO
 * @date 1/17/2023 11:26 AM
 */
public class Sword035 {
    public static void main(String[] args) {

    }
    public Node copyRandomList(Node head) {
        //使用hash表的方法去解决这个问题
        if (head==null){
            return null;
        }
        Map<Node,Node> map = new HashMap<>();
        Node curr = head;
        //赋值各个节点 构建原节点->新节点的映射关系
        while (curr!=null){
            map.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        curr=head;
        //构建新的链表
        while (curr!=null){
            map.get(curr).next=map.get(curr.next);
            map.get(curr).random=map.get(curr.random);
            curr=curr.next;
        }
        return map.get(head);
    }

}
