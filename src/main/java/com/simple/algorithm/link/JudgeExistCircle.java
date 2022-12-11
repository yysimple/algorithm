package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 判断链表是否成环
 *
 * @author: WuChengXing
 * @create: 2022-12-11 22:04
 **/
public class JudgeExistCircle {

    @Test
    public void testResult() {
        LinkNode<Integer> linkNode = NodeInit.initNodeCycle();
        System.out.println(existCircle(linkNode));
    }

    public boolean existCircle(LinkNode<Integer> sourceNode) {
        LinkNode<Integer> fast = sourceNode, slow = sourceNode;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.val.equals(slow.val)) {
                return true;
            }
        }
        return false;
    }
}
