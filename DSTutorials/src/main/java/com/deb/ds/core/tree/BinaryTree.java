package com.deb.ds.core.tree;

public class BinaryTree {

	// 10
	// 11 15
	// 32 25 17 9
	public static void main(String[] args) {

		BinaryTree demo = new BinaryTree();
		TreeNode node = TreeNode.createBinaryTree();

		System.out.println("Pre Order Traversal");
		demo.preOrderTraversal(node);

		System.out.println("\nIn Order Traversal");
		demo.inOrderTraversal(node);

		System.out.println("\nPost Order Traversal");
		demo.postOrderTraversal(node);

		System.out.println("\nMax Value In Tree:" + demo.findMaxValue(node));

	}

	private void preOrderTraversal(TreeNode node) {

		if (node == null)
			return;
		System.out.print(node.data + "->");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	private void inOrderTraversal(TreeNode node) {
		if (node == null)
			return;

		inOrderTraversal(node.left);
		System.out.print(node.data + "->");
		inOrderTraversal(node.right);
	}

	private void postOrderTraversal(TreeNode node) {
		if (node == null)
			return;

		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data + "->");
	}

	private int findMaxValue(TreeNode node) {
		if (node == null)
			return Integer.MIN_VALUE;
		int maxValue = node.data;
		int leftValue = findMaxValue(node.left);
		int rightValue = findMaxValue(node.right);
		maxValue = Math.max(maxValue, leftValue);
		maxValue = Math.max(maxValue, rightValue);
		return maxValue;
	}
}
