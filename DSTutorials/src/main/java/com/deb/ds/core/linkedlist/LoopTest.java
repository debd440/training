package com.deb.ds.core.linkedlist;

public class LoopTest {
	public static void main(String[] args) {

		LoopTest demo = new LoopTest();
		LinkedNode root = new LinkedNode("A");
		LinkedNode ln2 = new LinkedNode("B");
		LinkedNode ln3 = new LinkedNode("C");
		LinkedNode ln4 = new LinkedNode("D");
		root.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4; 
		System.out.println("Display Data");
		demo.display(root);
	}

	public void display(LinkedNode root) {
		LinkedNode current = root;
		while (current != null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
	}
}
