package com.deb.ds.core.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

    public static void main(String[] args) {
        Map<Node, Node> map = new HashMap<>();
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        node1.neighbours.add(node1);
        node2.neighbours.add(node3);
        node3.neighbours.add(node1); // cy
        CloneGraph cg = new CloneGraph();
        Node clonedGraph = cg.cloneGraph(node1, map);

        System.out.println("Graph cloned successfully.");
    }

    public Node cloneGraph(Node head, Map<Node, Node> map) {
        if (head == null)
            return null;
        if (map.containsKey(head))
            return map.get(head);

        Node clone = new Node(head.data);
        map.put(head, clone);

        for (Node neighbour : head.neighbours) {
            clone.neighbours.add(cloneGraph(neighbour, map));
        }
        return clone;
    }
}

class Node {
    String data;
    List<Node> neighbours;

    public Node(String data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
    }
}