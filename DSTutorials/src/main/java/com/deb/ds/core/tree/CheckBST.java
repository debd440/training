package com.deb.ds.core.tree;

public class CheckBST {

	// 10
	// 11 15
	// 32 25 17 9
	public static void main(String[] args) {

		CheckBST demo = new CheckBST();

		TreeNode node = TreeNode.createBinaryTree();
		boolean result = demo.isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println("Example 1- This is not BST: " + result);

		node = TreeNode.createBSTTree();
		result = demo.isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println("Example 2- This is  BST: " + result);
	}

	private boolean isBST(TreeNode node, int minKey, int maxKey) {

		if (node == null)
			return true;
		if (node.data < minKey || node.data > maxKey)
			return false;

		return isBST(node.left, minKey, node.data) && isBST(node.right, node.data, maxKey);
	}
}
