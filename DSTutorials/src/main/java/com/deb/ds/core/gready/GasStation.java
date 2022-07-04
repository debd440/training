package com.deb.ds.core.gready;

public class GasStation {

	// Leetcode- 134- https://leetcode.com/problems/gas-station/

	/*
	 * 
	 * There are n gas stations along a circular route, where the amount of gas at
	 * the ith station is gas[i].
	 * 
	 * You have a car with an unlimited gas tank and it costs cost[i] of gas to
	 * travel from the ith station to its next (i + 1)th station. You begin the
	 * journey with an empty tank at one of the gas stations.
	 */
	public static void main(String[] args) {

		int gas[] = { 1, 2, 3, 4, 5 };
		int cost[] = { 3, 4, 5, 1, 2 };
		System.out.println("Starting Index: " + findStart(gas, cost));
	}

	private static int findStart(int gas[], int cost[]) {

		int index = 0;
		int total = 0;
		int tank = 0;
		for (int i = 0; i < cost.length; i++) {
			int consume = gas[i] - cost[i];
			tank += consume;
			if (tank < 0) {
				tank = 0;
				index = i + 1;
			}
			total += consume;
		}
		return total < 0 ? -1 : index;
	}
}
