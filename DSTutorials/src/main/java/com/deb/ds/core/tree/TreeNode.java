package com.deb.ds.core.tree;

public class TreeNode {

	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int data) {
		this.data = data;
	}

	public static TreeNode createBinaryTree() {
		// 10
		// 11 15
		// 32 25 17 9
		TreeNode root = new TreeNode(10);
		TreeNode node11 = new TreeNode(11);
		TreeNode node12 = new TreeNode(15);
		TreeNode node111 = new TreeNode(32);
		TreeNode node112 = new TreeNode(25);
		TreeNode node121 = new TreeNode(17);
		TreeNode node122 = new TreeNode(9);

		root.left = node11;
		root.right = node12;

		node11.left = node111;
		node11.right = node112;

		node12.left = node121;
		node12.right = node122;
		return root;
	}

	public static TreeNode createSkewedTree() {
		// 1
		// 10 16
		// 18
		// 21
		TreeNode root = new TreeNode(1);
		TreeNode node11 = new TreeNode(10);
		TreeNode node12 = new TreeNode(16);
		TreeNode node111 = new TreeNode(18);
		TreeNode node1111 = new TreeNode(21);

		root.left = node11;
		root.right = node12;

		node11.left = node111;
		node111.left = node1111;

		return root;
	}
	
	public static TreeNode createBSTTree() {
		// 13
		// 10 16
		TreeNode root = new TreeNode(13);
		TreeNode node11 = new TreeNode(10);
		TreeNode node12 = new TreeNode(16);

		root.left = node11;
		root.right = node12;
		return root;
	}
	
	public static TreeNode createMirrorTree() {
		// 1
		// 2  2
		// 3 4 4 3
		TreeNode root = new TreeNode(1);
		TreeNode node11 = new TreeNode(2);
		TreeNode node12 = new TreeNode(2);
		TreeNode node111 = new TreeNode(3);
		TreeNode node112 = new TreeNode(4);
		TreeNode node121 = new TreeNode(4);
		TreeNode node122 = new TreeNode(3);

		root.left = node11;
		root.right = node12;

		node11.left = node111;
		node11.right = node112;

		node12.left = node121;
		node12.right = node122;
		return root;
	}
}
