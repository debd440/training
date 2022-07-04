package com.deb.ds.core.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	List<GraphNode> nodeList;
	int[][] adjMatrix;

	public Graph(List<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjMatrix = new int[nodeList.size()][nodeList.size()];
	}

	private List<GraphNode> getNeighbours(GraphNode current) {

		List<GraphNode> neighbours = new ArrayList<>();
		int index = current.index;
		for (int i = 0; i < adjMatrix.length; i++) {
			if (adjMatrix[index][i] == 1) {
				neighbours.add(nodeList.get(i));
			}
		}
		return neighbours;
	}

	public void addNeighbours(int i, int j) {
		adjMatrix[i][j] = 1;
		adjMatrix[j][i] = 1;
	}

	public void addDirectedNeighbours(int i, int j) {
		adjMatrix[i][j] = 1;
	}

	private void bfsTraversal(GraphNode node) {

		Queue<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GraphNode current = queue.poll();
			current.isVisited = true;
			System.out.print(current.data + "-->");
			List<GraphNode> neighbours = getNeighbours(current);
			for (GraphNode neighbour : neighbours) {
				if (!neighbour.isVisited) {
					queue.add(neighbour);
					neighbour.isVisited = true;
				}
			}
		}
	}

	private void dfsTraversal(GraphNode node) {

		Stack<GraphNode> stack = new Stack<>();
		stack.push(node);
		while (!stack.isEmpty()) {
			GraphNode current = stack.pop();
			current.isVisited = true;
			System.out.print(current.data + "-->");
			List<GraphNode> neighbours = getNeighbours(current);
			for (GraphNode neighbour : neighbours) {
				if (!neighbour.isVisited) {
					stack.add(neighbour);
					neighbour.isVisited = true;
				}
			}
		}
	}

	private void topologicalSortTraversal(GraphNode node, Stack<GraphNode> stack) {

		List<GraphNode> neighbours = getNeighbours(node);
		for (GraphNode neighbour : neighbours) {
			if (!neighbour.isVisited) {
				topologicalSortTraversal(neighbour, stack);
			}
		}
		node.isVisited = true;
		stack.push(node);
	}

	public void bfs() {

		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				bfsTraversal(node);
			}
		}
	}

	public void dfs() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				dfsTraversal(node);
			}
		}
	}

	public void topologicalSort() {

		Stack<GraphNode> stack = new Stack<>();
		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				topologicalSortTraversal(node, stack);
			}
		}
		while (!stack.isEmpty()) {
			GraphNode current = stack.pop();
			System.out.print(current.data + "-->");
		}
	}
}
