package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 反转区间内的节点
 *
 * @author: WuChengXing
 * @create: 2022-12-13 20:48
 **/
public class ReservePartLink {

    @Test
    public void testResult() {
        LinkNode<Integer> node = NodeInit.initNode2();
        System.out.println(reservePartLink(node, 2, 5));
    }

    public LinkNode<Integer> reservePartLink(LinkNode<Integer> node, int m, int n) {
        if (m == 1) {
            // 这里就是找到头节点了
            return ReserveNLink.reserveNLink(node, n);
        }
        // 最后将 m节点位置的下一个节点指向最后反转好了的链表就可以了
        node.next = reservePartLink(node.next, --m, --n);
        return node;
    }
}
