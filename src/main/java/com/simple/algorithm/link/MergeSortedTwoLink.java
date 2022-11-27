package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 合并两个有序链表
 *
 * @author: WuChengXing
 * @create: 2022-11-26 17:10
 **/
public class MergeSortedTwoLink {

    @Test
    public void testResult() {
        LinkNode<Integer> linkNode1 = NodeInit.initNode();
        LinkNode<Integer> linkNode2 = NodeInit.initNode2();
        System.out.println(LinkNode.printNode(testMergeSortedTwoLink(linkNode1, linkNode2)));
    }

    public LinkNode<Integer> testMergeSortedTwoLink(LinkNode<Integer> linkNode1, LinkNode<Integer> linkNode2) {
        LinkNode<Integer> result = new LinkNode<>(null, -1);
        LinkNode<Integer> point = result;
        while (linkNode1 != null && linkNode2 != null) {
            if (linkNode1.val > linkNode2.val) {
                point.next = linkNode2;
                linkNode2 = linkNode2.next;
            } else {
                point.next = linkNode1;
                linkNode1 = linkNode1.next;
            }
            point = point.next;
        }
        if (linkNode1 != null) {
            point.next = linkNode1;
        }
        if (linkNode2 != null) {
            point.next = linkNode2;
        }
        return result;
    }

}
