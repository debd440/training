package com.deb.ds.core.tree;

public class InvertBinaryTree {
	// 10
	// 11 15
	// 32 25 17 9
	public static void main(String[] args) {

		InvertBinaryTree demo = new InvertBinaryTree();
		TreeNode node = TreeNode.createBinaryTree();
		demo.invertTree(node);
		System.out.println("Use Leve Order Traversal To Verify The Same");

		LevelOrderTraversal levelOrder = new LevelOrderTraversal();
		levelOrder.levelOrderTraversal(node);
	}

	private void invertTree(TreeNode node) {
		if (node == null)
			return;
		invertTree(node.left);
		invertTree(node.right);
		reverseTree(node);
	}

	private void reverseTree(TreeNode node) {

		if (node == null)
			return;
		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
	}

}
