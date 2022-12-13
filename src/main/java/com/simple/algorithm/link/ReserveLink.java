package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 反转链表
 *
 * @author: WuChengXing
 * @create: 2022-12-13 19:10
 **/
public class ReserveLink {

    @Test
    public void testResult() {
        LinkNode<Integer> node = NodeInit.initNeed(1, 2, 3, 4, 5);
        System.out.println(LinkNode.printNode(reserveLink(node)));
    }

    public LinkNode<Integer> reserveLink(LinkNode<Integer> node) {
        if (node == null || node.next == null) {
            return node;
        }
        LinkNode<Integer> last = reserveLink(node.next);
        node.next.next = node;
        node.next = null;
        return last;
    }
}
