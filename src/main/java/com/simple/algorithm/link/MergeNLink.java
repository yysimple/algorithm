package com.simple.algorithm.link;

import com.simple.algorithm.common.init.NodeInit;
import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 合并多个链表
 *
 * @author: WuChengXing
 * @create: 2022-12-04 14:15
 **/
public class MergeNLink {

    @Test
    public void testResult() {
        List<LinkNode<Integer>> nLinks = new ArrayList<>();
        LinkNode<Integer> node1 = NodeInit.initNeed(1, 4, 5);
        LinkNode<Integer> node2 = NodeInit.initNeed(1, 3, 4);
        LinkNode<Integer> node3 = NodeInit.initNeed(2, 6);
        nLinks.add(node1);
        nLinks.add(node2);
        nLinks.add(node3);
        System.out.println(mergeNLink(nLinks));
    }

    /**
     * 合并N个有序链表，这里利用的是最小优先级队列
     *
     * @param nLinks
     * @return
     */
    public LinkNode<Integer> mergeNLink(List<LinkNode<Integer>> nLinks) {
        LinkNode<Integer> vNode = new LinkNode<>(-1);
        LinkNode<Integer> point = vNode;
        PriorityQueue<LinkNode<Integer>> pq = new PriorityQueue<>(nLinks.size(), Comparator.comparingInt(LinkNode::getVal));
        for (LinkNode<Integer> nLink : nLinks) {
            pq.add(nLink);
        }
        LinkNode<Integer> min = pq.poll();
        while (min != null) {
            point.next = min;
            min = min.next;
            if (min != null) {
                pq.add(min);
            }
            min = pq.poll();
            point = point.next;
        }
        return vNode.next;
    }


}
