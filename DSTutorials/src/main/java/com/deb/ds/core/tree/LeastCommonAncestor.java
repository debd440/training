package com.deb.ds.core.tree;

public class LeastCommonAncestor {

	// 13
	// 10 16
	public static void main(String[] args) {

		LeastCommonAncestor demo = new LeastCommonAncestor();
		TreeNode root = new TreeNode(13);
		TreeNode node11 = new TreeNode(10);
		TreeNode node12 = new TreeNode(16);

		root.left = node11;
		root.right = node12;
		TreeNode lca = demo.findLCA(root, node11, node12);
		System.out.println("LCA Is: " + lca.data);
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
