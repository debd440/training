package com.deb.ds.core.search;

public class AllocateBooks {
	// https://www.interviewbit.com/problems/allocate-books/

	/*
	 * Given an array of integers A of size N and an integer B. College library has
	 * N bags,the ith book has A[i] number of pages. You have to allocate books to B
	 * number of students so that maximum number of pages alloted to a student is
	 * minimum.
	 * 
	 * A book will be allocated to exactly one student. Each student has to be
	 * allocated at least one book. Allotment should be in contiguous order, for
	 * example: A student cannot be allocated book 1 and book 3, skipping book 2.
	 * 
	 */
	public static void main(String[] args) {

		AllocateBooks demo = new AllocateBooks();

		int books[] = { 12, 34, 67, 90 };
		int students = 2;
		System.out.println(demo.books(books, students));
	}

	public int books(int[] books, int students) {

		int max = Integer.MIN_VALUE;
		int total = 0;
		for (int i = 0; i < books.length; i++) {
			max = Math.max(max, books[i]);
			total += books[i];
		}
		int start = max;
		int end = total;

		while (start < end) {
			int mid = (start + end) / 2;
			int requiredStudent = getRequiredReaders(books, mid);
			if (requiredStudent <= students) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	private int getRequiredReaders(int[] books, int mid) {

		int total = 0;
		int student = 1;
		for (int i = 0; i < books.length; i++) {
			total += books[i];
			if (total > mid) {
				student++;
				total = books[i];
			}
		}
		return student;
	}
}
