/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolution;

/**
 *
 * @author chen
 */
public class MergeTwoSortedList {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode fakehead = new ListNode(0);
        ListNode p = fakehead;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        } else if (p2 != null) {
            p.next = p2;
        }

        return fakehead.next;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);

        p1.next = p3;
        p3.next = p4;
        p2.next = p5;

        ListNode merge = mergeTwoLists(p1, p2);
        while (merge != null) {
            System.out.print(merge.val + " ");
            merge = merge.next;
        }
    }

}
