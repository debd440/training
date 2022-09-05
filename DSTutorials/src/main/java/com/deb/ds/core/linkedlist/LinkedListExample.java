package com.deb.ds.core.linkedlist;

public class LinkedListExample {
	public static void main(String[] args) {

		// Time Complexity: O(N)
		// Space Complexity: O(1)
		LinkedListExample demo = new LinkedListExample();
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
		demo.display(root);
		System.out.println("Middle Node: " + demo.findMiddleNode(root).data);
	}

	public LinkedNode findMiddleNode(LinkedNode root) {
		LinkedNode slow = root;
		LinkedNode fast = root;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public void display(LinkedNode root) {

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
