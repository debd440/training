package com.deb.ds.core.tree;

import java.util.concurrent.atomic.AtomicBoolean;

public class CheckBinaryTree {

	// 10
	// 11 15
	// 32 25 17 9
	public static void main(String[] args) {

		CheckBinaryTree demo = new CheckBinaryTree();

		// By Default assuming its true
		TreeNode node = TreeNode.createBinaryTree();
		AtomicBoolean result = new AtomicBoolean(true);
		demo.checkBinaryTree(node, result);
		System.out.println("Result: Example 1: This is Balanced tree:- " + result.get());

		// Negative Case
		node = TreeNode.createSkewedTree();
		result = new AtomicBoolean(true);
		demo.checkBinaryTree(node, result);
		System.out.println("Result: Example 2: This is not Balanced tree:- " + result.get());
	}

	private int checkBinaryTree(TreeNode node, AtomicBoolean result) {

		if (node == null || !result.get())
			return 0;
		int leftHeight = checkBinaryTree(node.left, result);
		int rightHeight = checkBinaryTree(node.right, result);
		if (Math.abs(leftHeight - rightHeight) > 1) {
			result.set(false);
		}

		return Math.max(leftHeight, rightHeight) + 1;
	}
}
