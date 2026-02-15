package com.deb.ds.core.linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {

        // Time Complexity: O(N)
        // Space Complexity: O(1)
        LinkedNode root = new LinkedNode("A");
        LinkedNode ln2 = new LinkedNode("B");
        LinkedNode ln3 = new LinkedNode("C");
        LinkedNode ln4 = new LinkedNode("D");
        LinkedNode ln5 = new LinkedNode("E");
        root.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;

        System.out.println("Display Data");
        LinkedNode reverse = reverseList(root);
        display(reverse); //E-->D-->C-->B-->A-->
    }

    public static LinkedNode reverseList(LinkedNode head) {
        LinkedNode prev = null;
        LinkedNode curr = head;

        while (curr != null) {
            LinkedNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
