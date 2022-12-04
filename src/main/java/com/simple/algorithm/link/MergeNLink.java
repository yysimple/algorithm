package com.simple.algorithm.link;

import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

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

    }

    public LinkNode<Integer> mergeNLink(List<List<LinkNode<Integer>>> nLinks) {
        LinkNode<Integer> vNode = new LinkNode<>(-1);
        LinkNode<Integer> point = vNode;
        PriorityQueue<LinkNode> pq = new PriorityQueue<>(
                nLinks.length, (a, b) -> (a.val - b.val));
    }


}
