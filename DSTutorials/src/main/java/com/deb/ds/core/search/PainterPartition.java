package com.deb.ds.core.search;

public class PainterPartition {

	public static void main(String[] args) {
		
		PainterPartition demo = new PainterPartition();
		int noOfPainter = 2;
		int time = 5;
		int board[] = { 1, 10 };
		System.out.println(demo.paint(noOfPainter, time, board));
	}

	public int paint(int noOfPainter, int time, int board[]) {
		int max = 0;
		int total = 0;
		for (int i = 0; i < board.length; i++) {
			max = Math.max(max, board[i]);
			total += board[i];
		}

		int start = max;
		int end = total;
		while (start < end) {
			int mid = (start + end) / 2;
			int requiredPainter = requiredPainter(board, mid);
			if (requiredPainter <= noOfPainter) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start * time;
	}

	private int requiredPainter(int board[], int mid) {

		int painters = 1;
		int total = 0;
		for (int i = 0; i < board.length; i++) {
			total += board[i];
			if (total > mid) {
				painters++;
				total = board[i];
			}
		}
		return painters;
	}
}
