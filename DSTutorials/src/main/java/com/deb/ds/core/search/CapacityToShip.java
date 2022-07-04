package com.deb.ds.core.search;

import java.util.ArrayList;
import java.util.List;

public class CapacityToShip {

	// https://www.interviewbit.com/problems/capacity-to-ship-packages-within-b-days/
	public static void main(String[] args) {

		CapacityToShip demo = new CapacityToShip();
		int capacity[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int providedDays = 5;
		System.out.println("Weight Required " + demo.capacityRequired(capacity, providedDays));
		
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < capacity.length; i++) {
			a.add(capacity[i]);
		}
		System.out.println(demo.solve(a, providedDays));
	}

	public int capacityRequired(int capacity[], int providedDays) {

		int max = 0;
		int total = 0;

		for (int i = 0; i < capacity.length; i++) {
			max = Math.max(max, capacity[i]);
			total += capacity[i];
		}
		int start = max;
		int end = total;

		while (start < end) {
			int mid = (start + end) / 2;
			int noOfDaysRequired = noOfDaysRequired(capacity, mid);
			if (noOfDaysRequired < providedDays) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	private int noOfDaysRequired(int capacity[], int mid) {
		int noOfDays = 1;
		int total = 0;
		for (int i = 0; i < capacity.length; i++) {
			total += capacity[i];
			if (total > mid) {
				total = capacity[i];
				noOfDays++;
			}
		}
		return noOfDays;
	}

	public int solve(ArrayList<Integer> A, int B) {
		int low = 0;
		int high = 0;

		for (int num : A) {
			low = Math.max(low, num);
			high += num;
		}
		// System.out.println(high);

		while (low < high) {
			int mid = low + (high - low) / 2;
			int days = numberOfDays(A, mid);
			// System.out.println(low + " " + days);

			if (days > B) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		return low;
	}

	public int numberOfDays(ArrayList<Integer> A, int maxWt) {
		int numDays = 1;
		int sum = 0;

		for (int num : A) {
			sum += num;

			if (sum > maxWt) {
				numDays++;
				sum = num;
			}
		}

		return numDays;
	}
}
