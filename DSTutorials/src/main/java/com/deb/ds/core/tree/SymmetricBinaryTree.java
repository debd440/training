package com.deb.ds.core.tree;

public class SymmetricBinaryTree {

	/*
	 * 1 / \ 2 2 / \ / \ 3 4 4 3
	 */
	public static void main(String[] args) {
		SymmetricBinaryTree demo = new SymmetricBinaryTree();

		// By Default assuming its true
		TreeNode node = TreeNode.createBinaryTree();
		System.out.println(demo.isMirroredTrees(node.left, node.right));

		node = TreeNode.createMirrorTree();
		System.out.println(demo.isMirroredTrees(node.left, node.right));
	}

	private boolean isMirroredTrees(TreeNode a, TreeNode b) {

		if (a == null && b == null) {
			return true;
		}

		if (a != null && b != null) {
			return a.data == b.data && isMirroredTrees(a.left, b.right) && isMirroredTrees(a.right, b.left) ? true
					: false;
		}

		return false;
	}
}
