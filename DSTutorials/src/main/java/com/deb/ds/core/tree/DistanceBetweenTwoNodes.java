package com.deb.ds.core.tree;

public class DistanceBetweenTwoNodes {
	// 10
	// 11 15
	// 32 25 17 9
	public static void main(String[] args) {

		DistanceBetweenTwoNodes demo = new DistanceBetweenTwoNodes();
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

		System.out.println("Distance: " + demo.findDistance(root, node111, node122));
	}

	private int findDistance(TreeNode node, TreeNode node1, TreeNode node2) {

		TreeNode lca = null;
		if (isNodeExist(node, node1) && isNodeExist(node, node2)) {
			lca = findLCA(node, node1, node2);
		} else {
			return Integer.MIN_VALUE;
		}

		return findLevel(lca, node1, 0) + findLevel(lca, node2, 0);
	}

	private int findLevel(TreeNode lca, TreeNode node, int level) {

		if (lca == null)
			return Integer.MIN_VALUE;

		if (lca == node)
			return level;

		int left = findLevel(lca.left, node, level + 1);
		if (left != Integer.MIN_VALUE)
			return left;

		return findLevel(lca.right, node, level + 1);
	}

	private boolean isNodeExist(TreeNode node, TreeNode node1) {

		if (node == null)
			return false;

		if (node == node1)
			return true;

		return isNodeExist(node.left, node1) || isNodeExist(node.right, node1);
	}

	private TreeNode findLCA(TreeNode node, TreeNode node1, TreeNode node2) {

		if (node == null)
			return null;
		if (node == node1 || node == node2)
			return node;

		TreeNode left = findLCA(node.left, node1, node2);
		TreeNode right = findLCA(node.right, node1, node2);

		if (left != null && right != null)
			return node;

		return (left != null) ? left : right;
	}

}
