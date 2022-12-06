package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 倒数第n个节点
 *
 * @author: WuChengXing
 * @create: 2022-12-06 22:55
 **/
public class ReciprocalNNode {

    @Test
    public void testResult() {
        LinkNode<Integer> linkNode = NodeInit.initNode2();
        System.out.println(reciprocalNNode(linkNode, 9));
    }

    /**
     * 双指针法就可以了
     *
     * @param linkNode
     * @return
     */
    public Integer reciprocalNNode(LinkNode<Integer> linkNode, int n) {
        if (n < 1) {
            return -1;
        }
        LinkNode<Integer> slow = linkNode;
        LinkNode<Integer> fast = linkNode;
        for (int i = 0; i < n; i++) {
            if (fast != null) {
                fast = fast.next;
            }
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

}
