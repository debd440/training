package com.deb.ds.core.tree;

import java.util.HashMap;
import java.util.Map;

public class TopBottomView {

	// 10
	// 11 15
	// 32 25 17 9

	static Map<Integer, String> topView = new HashMap<>();
	static Map<Integer, String> bottomView = new HashMap<>();

	public static void main(String[] args) {

		TopBottomView demo = new TopBottomView();

		// Top View
		TreeNode node = TreeNode.createBinaryTree();
		demo.topView(node, 0, 0);
		System.out.println("Top View");
		demo.print(topView);

		// Bottom View
		demo.bottomView(node, 0, 0);
		System.out.println("Bottom View");
		demo.print(bottomView);
	}

	private void topView(TreeNode node, int distance, int level) {
		if (node == null)
			return;

		if (topView.containsKey(distance)) {
			String data[] = topView.get(distance).split("_");
			int mapLevel = Integer.parseInt(data[1]);
			if (level < mapLevel) {
				topView.put(distance, node.data + "_" + level);
			}
		} else {
			topView.put(distance, node.data + "_" + level);
		}
		topView(node.left, distance - 1, level + 1);
		topView(node.right, distance + 1, level + 1);
	}

	private void bottomView(TreeNode node, int distance, int level) {
		if (node == null)
			return;

		if (bottomView.containsKey(distance)) {
			String data[] = bottomView.get(distance).split("_");
			int mapLevel = Integer.parseInt(data[1]);
			if (level > mapLevel) {
				bottomView.put(distance, node.data + "_" + level);
			}
		} else {
			bottomView.put(distance, node.data + "_" + level);
		}
		bottomView(node.left, distance - 1, level + 1);
		bottomView(node.right, distance + 1, level + 1);
	}

	private void print(Map<Integer, String> view) {
		view.forEach((k, v) -> {
			System.out.println("Key: " + k + " Value: " + v);
		});
	}
}
