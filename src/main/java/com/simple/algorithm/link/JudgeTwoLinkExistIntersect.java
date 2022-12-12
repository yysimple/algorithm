package com.simple.algorithm.link;

import com.simple.algorithm.common.model.LinkNode;
import org.junit.Test;

/**
 * 项目: algorithm
 * <p>
 * 功能描述: 判断两链表是否相交
 *
 * @author: WuChengXing
 * @create: 2022-12-12 19:38
 **/
public class JudgeTwoLinkExistIntersect {

    @Test
    public void testResult() {
        LinkNode<Integer> c2 = new LinkNode<>(null, 11);
        LinkNode<Integer> c1 = new LinkNode<>(c2, 9);
        LinkNode<Integer> a2 = new LinkNode<>(c1, 7);
        LinkNode<Integer> a1 = new LinkNode<>(a2, 1);

        LinkNode<Integer> b3 = new LinkNode<>(c1, 4);
        LinkNode<Integer> b2 = new LinkNode<>(b3, 3);
        LinkNode<Integer> b1 = new LinkNode<>(b2, 2);
        LinkNode<Integer> x = twoLinkExistIntersect(a1, b1);
        System.out.println(x.val);
    }

    public LinkNode<Integer> twoLinkExistIntersect(LinkNode<Integer> node1, LinkNode<Integer> node2) {
        LinkNode<Integer> p1 = node1, p2 = node2;
        while (p1 != p2) {
            if (p1 == null) {
                p1 = node2;
            }else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = node1;
            }else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}
