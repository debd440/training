package com.deb.ds.core.tree;

public class LevelOrderTraversal {

	// 10
	// 11 15
	// 32 25 17 9
	public static void main(String[] args) {

		LevelOrderTraversal demo = new LevelOrderTraversal();
		TreeNode node = TreeNode.createBinaryTree();
		demo.levelOrderTraversal(node);
	}

	public void levelOrderTraversal(TreeNode node) {

		int level = 1;
		while (printPath(node, level)) {
			level++;
		}
	}

	private boolean printPath(TreeNode node, int level) {

		if (node == null)
			return false;

		if (level == 1) {
			System.out.print(node.data + "-->");
			return true;
		}

		boolean left = printPath(node.left, level - 1);
		boolean right = printPath(node.right, level - 1);

		return left || right;
	}
}
