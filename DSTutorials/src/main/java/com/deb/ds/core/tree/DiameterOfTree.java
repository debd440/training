package com.deb.ds.core.tree;

import java.util.concurrent.atomic.AtomicInteger;

public class DiameterOfTree {
	// Diameter of tree Or Max length Of Tree
	// 10
	// 11 15
	// 32 25 17 9
	public static void main(String[] args) {

		DiameterOfTree demo = new DiameterOfTree();

		TreeNode node = TreeNode.createBinaryTree();
		AtomicInteger height = new AtomicInteger();
		demo.findDiameter(node, height);
		System.out.println("Height: " + height.get());
	}

	private int findDiameter(TreeNode node, AtomicInteger height) {

		if (node == null)
			return 0;

		int leftHeight = findDiameter(node.left, height);
		int rightHeight = findDiameter(node.right, height);

		int newDiameter = leftHeight + rightHeight + 1;

		height.set(Math.max(height.get(), newDiameter));

		return Math.max(leftHeight, rightHeight) + 1;
	}
}
