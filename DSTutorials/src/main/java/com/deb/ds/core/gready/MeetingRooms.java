package com.deb.ds.core.gready;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingRooms {

	// https://www.interviewbit.com/problems/meeting-rooms/
	// Return the minimum number of conference rooms required so that all meetings
	// can be done.
	public static void main(String[] args) {

		List<List<Integer>> data = new ArrayList<>();
		List<Integer> data1 = Arrays.asList(0, 30);
		List<Integer> data2 = Arrays.asList(5, 10);
		List<Integer> data3 = Arrays.asList(15, 20);
		data.add(data1);
		data.add(data2);
		data.add(data3);
		System.out.println("Result: " + solve(data));
	}

	public static int solve(List<List<Integer>> data) {

		// Get Arrival & Depart in Separated Array In Sorted Form
		int arrival[] = new int[data.size()];
		int depart[] = new int[data.size()];

		int j = 0;
		for (List<Integer> item : data) {
			arrival[j] = item.get(0);
			depart[j] = item.get(1);
			j++;
		}
		Arrays.sort(arrival);
		Arrays.sort(depart);

		int idx = 0;
		for (int i = 0; i < arrival.length; i++) {
			// Check For Depart Time. As we need to calculate minimum rooms
			if (arrival[i] >= depart[idx]) {
				idx++;
			}
		}
		return arrival.length - idx;
	}
}
