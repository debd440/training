package com.deb.ds.core.array;

import java.util.Arrays;

public class HotelBooking {

	/*
	 * A hotel manager has to process N advance bookings of rooms for the next
	 * season. His hotel has K rooms. Bookings contain an arrival date and a
	 * departure date. He wants to find out whether there are enough rooms in the
	 * hotel to satisfy the demand.
	 * 
	 * Input : Arrivals : [1 3 5] Departures : [2 6 8] K: 1 Output: False Hotel
	 * manager needs at least two rooms as the second and third intervals overlap.
	 */

	public static void main(String[] args) {

		int arrival[] = { 1, 3, 5 };
		int depart[] = { 2, 6, 8 };
		int k = 1;
		System.out.println("Example 1: Result: " + checkStatus1(arrival, depart, k));

		int arrival1[] = { 1, 3, 7 };
		int depart1[] = { 2, 6, 9 };
		System.out.println("Example 2: Result: " + checkStatus1(arrival1, depart1, k));

		int arrival2[] = { 1, 3, 5 };
		int depart2[] = { 2, 6, 8 };
		System.out.println("Example 3: Result: " + checkStatus1(arrival2, depart2, 2));
	}

	private static boolean checkStatus(int arrival[], int depart[], int k) {

		Arrays.sort(arrival);
		Arrays.sort(depart);

		int size = arrival.length;
		// Run loop till size- k.
		for (int i = 0; i < size - k; i++) {
			// Check Arrival+ room number < depart date return false
			if (arrival[i + k] < depart[i])
				return false;
		}
		return true;
	}
	
	private static boolean checkStatus1(int arrival[], int depart[], int k) {

		Arrays.sort(arrival);
		Arrays.sort(depart);

		int idx = 0;
		for (int i = 0; i < arrival.length; i++) {
			// Check For Depart Time. As we need to calculate minimum rooms
			if (arrival[i] >= depart[idx]) {
				idx++;
			}
		}
		int min= arrival.length - idx;
		if(k>=min)
			return true;
		return false;
	}
}
