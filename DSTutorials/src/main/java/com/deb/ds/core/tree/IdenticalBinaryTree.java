package com.deb.ds.core.tree;

public class IdenticalBinaryTree {

	public static void main(String[] args) {

		IdenticalBinaryTree demo = new IdenticalBinaryTree();

		// By Default assuming its true
		TreeNode a = TreeNode.createBinaryTree();
		TreeNode b = TreeNode.createBinaryTree();
		System.out.println(demo.isSameTree(a, b));
	}

	private boolean isSameTree(TreeNode a, TreeNode b) {
		if (a == null && b == null) {
			return true;
		}
		//Both Node  should be null
		if (a == null || b == null) {
			return false;
		}
		if (a.data != b.data) {
			return false;
		}
		return isSameTree(a.right, b.right) & isSameTree(a.left, b.left);
	}
}
