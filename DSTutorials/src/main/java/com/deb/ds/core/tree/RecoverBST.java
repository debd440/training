package com.deb.ds.core.tree;

import java.util.ArrayList;
import java.util.Collections;

public class RecoverBST {

	// 1
	// 2 3
	public static void main(String[] args) {

		RecoverBST demo = new RecoverBST();
		TreeNode root = new TreeNode(1);
		TreeNode node11 = new TreeNode(2);
		TreeNode node12 = new TreeNode(3);

		root.left = node11;
		root.right = node12;
		ArrayList<Integer> result = demo.recoverTree(root);
		for (Integer data : result) {
			System.out.print(data + "->");
		}
	}

	TreeNode prev = null, first = null, second = null;

	private void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		// Node should be greater than left
		if (prev != null && node.data < prev.data) {
			// First and second are two node pointing to false condition
			second = node;
			if (first == null) {
				first = prev;
			} else {
				return;
			}
		}
		prev = node;
		inOrder(node.right);

	}

	public ArrayList<Integer> recoverTree(TreeNode A) {
		inOrder(A);
		ArrayList<Integer> result = new ArrayList<>();
		result.add(first.data);
		result.add(second.data);
		Collections.sort(result);
		return result;
	}
}
