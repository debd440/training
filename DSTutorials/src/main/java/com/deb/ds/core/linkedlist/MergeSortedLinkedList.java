package com.deb.ds.core.linkedlist;

public class MergeSortedLinkedList {

    public static void main(String[] args) {

        // List1: 1 -> 3 -> 5
        LinkedNode l1 = new LinkedNode("1");
        l1.next = new LinkedNode("3");
        l1.next.next = new LinkedNode("5");

        // List2: 2 -> 4 -> 6
        LinkedNode l2 = new LinkedNode("2");
        l2.next = new LinkedNode("4");
        l2.next.next = new LinkedNode("6");

        LinkedNode merged = mergeTwoLists(l1, l2);

        display(merged);
    }

    public static LinkedNode mergeTwoLists(LinkedNode list1, LinkedNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (Integer.parseInt(list1.data) <= Integer.parseInt(list2.data)) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void display(LinkedNode root) {

        LinkedNode current = root;
        int counter = 0;
        while (current != null && counter < 7) {
            System.out.print(current.data + "-->");
            current = current.next;
            counter++;
        }
        System.out.println("");
    }

}
