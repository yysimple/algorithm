package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 分隔链表 lc，86；143252
 *
 * @author: WuChengXing
 * @create: 2022-11-28 19:44
 **/
public class SeparateLinkedList {

    @Test
    public void testResult() {
        LinkNode<Integer> node = NodeInit.initNeed(1, 4, 3, 2, 5, 2);
        System.out.println(LinkNode.printNode(separateLinkedList(node, 3)));
    }

    public LinkNode<Integer> separateLinkedList(LinkNode<Integer> node, Integer val) {
        if (node == null || node.next == null) {
            return node;
        }
        LinkNode<Integer> p, small = new LinkNode<>(-1, null), large = new LinkNode<>(-1, null);
        LinkNode<Integer> l1 = small;
        LinkNode<Integer> l2 = large;
        p = node;
        while (p != null) {
            LinkNode<Integer> tmp = p.next;
            p.next = null;
            if (p.val < val) {
                l1.next = p;
                l1 = l1.next;
            } else {
                l2.next = p;
                l2 = l2.next;
            }
            // 这里每次都是用新的节点去接收对应的下一个节点，因为需要将
            p = tmp;
        }
        l1.next = large.next;
        return small.next;
    }


}
