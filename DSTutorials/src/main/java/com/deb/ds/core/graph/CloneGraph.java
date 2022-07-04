package com.deb.ds.core.graph;

import java.util.List;
import java.util.Map;

public class CloneGraph {

	class Node {
		String data;
		List<Node> neighbours;
	}

	public Node cloneGraph(Node head, Map<Node, Node> map) {
		if (head == null)
			return null;
		if (map.containsKey(head))
			return map.get(head);

		Node current = new Node();
		current.data = head.data;

		for (Node neighbour : head.neighbours) {
			current.neighbours.add(cloneGraph(neighbour, map));
		}
		return current;
	}
}
