package com.deb.ds.core.linkedlist;

public class LoopTest {

	public static void main(String[] args) {

		// Time Complexity: O(N)
		// Space Complexity: O(1)
		LoopTest demo = new LoopTest();
		LinkedNode root = new LinkedNode("A");
		LinkedNode ln2 = new LinkedNode("B");
		LinkedNode ln3 = new LinkedNode("C");
		LinkedNode ln4 = new LinkedNode("D");
		LinkedNode ln5 = new LinkedNode("E");
		root.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = ln2;
		System.out.println("Display Data");
		demo.display(root);
		System.out.println("Does Loop Exist: " + demo.isLoopExist(root));
		System.out.println("Loop Starting Point:  " + demo.findLoopStartingNode(root).data);
	}

	public boolean isLoopExist(LinkedNode root) {

		LinkedNode slow = root;
		LinkedNode fast = root;

		while (fast != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

	public LinkedNode findLoopStartingNode(LinkedNode root) {

		LinkedNode slow = root;
		LinkedNode fast = root;
		LinkedNode start = root;

		while (fast != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return findLoopPosition(start, fast);
			}
		}
		return null;
	}

	public LinkedNode findLoopPosition(LinkedNode start, LinkedNode pointer) {
		while (start != pointer) {
			pointer = pointer.next;
			start = start.next;
		}
		return start;
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
