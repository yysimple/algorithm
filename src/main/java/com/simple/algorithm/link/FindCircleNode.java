package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 找到循环的相交节点
 *
 * @author: WuChengXing
 * @create: 2022-12-11 22:42
 **/
public class FindCircleNode {

    @Test
    public void testResult() {
        LinkNode<Integer> x = NodeInit.initNodeCycle();
        System.out.println(findCircleNode(x).val);
        System.out.println(LinkNode.printNode(findCircleNode(x)));
    }

    public LinkNode<Integer> findCircleNode(LinkNode<Integer> node) {
        LinkNode<Integer> fast = node, slow = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        // 这里将slow置为node节点即可，此时快节点到相交节点的距离和头到节点的距离是一样的
        slow = node;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
