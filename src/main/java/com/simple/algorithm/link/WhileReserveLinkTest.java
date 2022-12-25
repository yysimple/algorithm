package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 使用循环方式遍历整个链表
 *
 * @author: WuChengXing
 * @create: 2022-12-25 23:18
 **/
public class WhileReserveLinkTest {

    @Test
    public void testResult() {
        LinkNode<Integer> node = NodeInit.initNeed(1, 2, 3, 4, 5);
        System.out.println(LinkNode.printNode(reserve(node)));
        LinkNode<Integer> node2 = NodeInit.initNeed(1, 2, 3, 4, 5);
        System.out.println(LinkNode.printNode(reserve(node2.next, node2.next.next.next)));

    }

    public LinkNode<Integer> reserve(LinkNode<Integer> head) {
        LinkNode<Integer> curr = head, next = head, pre = null;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public LinkNode<Integer> reserve(LinkNode<Integer> a, LinkNode<Integer> b) {
        LinkNode<Integer> curr = a, next, pre = null;
        while (curr != b) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
