package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 部分反转链表
 *
 * @author: WuChengXing
 * @create: 2022-12-26 22:39
 **/
public class ReserveGroupLinkTest {

    @Test
    public void testResult() {
        LinkNode<Integer> node = NodeInit.initNeed(1, 2, 3, 4, 5, 6, 7);
        System.out.println(LinkNode.printNode(reserveKGroup(node, 2)));
    }

    public LinkNode<Integer> reserveKGroup(LinkNode<Integer> head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        LinkNode<Integer> a, b;
        a = b = head;
        for (int i = 0; i < k; i++) {
            if (b == null) {
                return head;
            }
            b = b.next;
        }
        LinkNode<Integer> node = reserveBetween(a, b);
        a.next = reserveKGroup(b, k);
        return node;
    }

    public LinkNode<Integer> reserveBetween(LinkNode<Integer> a, LinkNode<Integer> b) {
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
