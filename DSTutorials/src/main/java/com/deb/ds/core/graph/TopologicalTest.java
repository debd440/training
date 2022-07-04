package com.deb.ds.core.graph;

import java.util.ArrayList;
import java.util.List;

public class TopologicalTest {

	// S
	// A B
	// C
	public static void main(String[] args) {

		// Time Complexity: O(V+E)
		List<GraphNode> nodeList = new ArrayList<>();
		// Define Node
		GraphNode node1 = new GraphNode("S", 0);
		GraphNode node21 = new GraphNode("A", 1);
		GraphNode node22 = new GraphNode("B", 2);
		GraphNode node3 = new GraphNode("C", 3);
		nodeList.add(node1);
		nodeList.add(node21);
		nodeList.add(node22);
		nodeList.add(node3);
		// Add Connection
		Graph graph = new Graph(nodeList);
		graph.addDirectedNeighbours(0, 1); // S-A
		graph.addDirectedNeighbours(0, 2); // S-B
		graph.addDirectedNeighbours(1, 3); // A-C

		System.out.println("Directed Graph Topological Sort Traversal");
		graph.topologicalSort();
	}
}
