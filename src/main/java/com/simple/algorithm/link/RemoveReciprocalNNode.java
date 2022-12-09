package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 删除倒数第N个节点
 *
 * @author: WuChengXing
 * @create: 2022-12-08 19:30
 **/
public class RemoveReciprocalNNode {

    @Test
    public void testResult() {
        LinkNode<Integer> nodes = NodeInit.initNeed(1, 2, 3, 4, 5);
        System.out.println(removeReciprocalNNode(nodes, 6));
    }

    public LinkNode<Integer> removeReciprocalNNode(LinkNode<Integer> nodes, int n) {
        LinkNode<Integer> vHead = nodes;
        LinkNode<Integer> slow = nodes;
        LinkNode<Integer> fast = nodes;
        for (int i = 0; i < n + 1; i++) {
            if (fast != null) {
                fast = fast.next;
            }
        }
        LinkNode<Integer> p = vHead;
        while (fast != null) {
            p = p.next;
            slow = slow.next;
            fast = fast.next;
        }
        if (p != null && slow.next != null) {
            slow = slow.next.next;
            p.next = slow;
        }
        return vHead;
    }

}
