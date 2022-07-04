package com.deb.ds.core.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

	// 10
	// 11 15
	// 32 25 17 9
	public static void main(String[] args) {

		ZigZagTraversal demo = new ZigZagTraversal();
		TreeNode node = TreeNode.createBinaryTree();
		List<List<TreeNode>> result = demo.zigzag(node);

		System.out.println("Show Result");
		for (List<TreeNode> list : result) {
			for (TreeNode level : list) {
				System.out.print(level.data + "-->");
			}
		}
	}

	private List<List<TreeNode>> zigzag(TreeNode node) {

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);
		boolean zigzag = false;
		List<List<TreeNode>> result = new ArrayList<>();

		while (!queue.isEmpty()) {

			List<TreeNode> curr = new ArrayList<>();

			for (int i = 0; i < queue.size(); i++) {

				TreeNode current = queue.poll();
				if (zigzag) {
					curr.add(0, current);
				} else {
					curr.add(current);
				}
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
			result.add(new ArrayList<>(curr));
			zigzag = !zigzag;
		}
		return result;
	}
}
