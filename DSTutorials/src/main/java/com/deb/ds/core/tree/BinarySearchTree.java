package com.deb.ds.core.tree;

public class BinarySearchTree {

	// Diameter of tree Or Max length Of Tree
	// 10
	// 11 15
	// 32 25 17 9
	public static void main(String[] args) {

		BinarySearchTree demo = new BinarySearchTree();

		TreeNode node = TreeNode.createBinaryTree();

		System.out.println("Height: " + demo.findHeight(node));
	}

	private int findHeight(TreeNode node) {

		if (node == null)
			return 0;

		int leftHeight = findHeight(node.left);
		int rightHeight = findHeight(node.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}
}
