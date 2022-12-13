package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 反转倒数第N个节点
 *
 * @author: WuChengXing
 * @create: 2022-12-13 19:54
 **/
public class ReserveNLink {

    static LinkNode<Integer> tmp = null;

    @Test
    public void testResult() {
        LinkNode<Integer> node = NodeInit.initNeed(1, 2, 3, 4, 5);
        System.out.println(reserveNLink(node, 3));
    }

    public static LinkNode<Integer> reserveNLink(LinkNode<Integer> node, int n) {
        if (n == 1) {
            tmp = node.next;
            return node;
        }
        LinkNode<Integer> last = reserveNLink(node.next, --n);
        node.next.next = node;
        node.next = tmp;
        return last;
    }
}
