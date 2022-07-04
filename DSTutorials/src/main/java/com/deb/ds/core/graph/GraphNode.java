package com.deb.ds.core.graph;

public class GraphNode {

	String data;
	Integer index;
	boolean isVisited = false;

	public GraphNode(String data, Integer index) {
		this.data = data;
		this.index = index;
	}
}
