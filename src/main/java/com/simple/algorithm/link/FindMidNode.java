package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 找到中间节点
 *
 * @author: WuChengXing
 * @create: 2022-12-11 21:49
 **/
public class FindMidNode {

    @Test
    public void testResult() {
        LinkNode<Integer> linkNode = NodeInit.initNode();
        System.out.println(findMidNode(linkNode));
    }

    public Integer findMidNode(LinkNode<Integer> sourceNode) {
        LinkNode<Integer> fast = sourceNode, slow = sourceNode;
        while (fast.next != null && slow != null) {
            // 快指针走两步
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
