package com.deb.ds.core.backtracking;

public class NQueenProblem {

	public static void main(String[] args) {
		int n = 6;
		Position[] position = new Position[n];
		boolean result = solveNQueen(n, 0, position);
		if (result) {
			for (int i = 0; i < position.length; i++) {
				System.out.println("Row: " + position[i].row + " Col: " + position[i].col);
			}
		} else {
			System.out.println("No Solution");
		}
	}

	private static boolean solveNQueen(int n, int row, Position position[]) {
		if (n == row)
			return true;

		for (int col = 0; col < n; col++) {

			boolean foundSafe = true;

			for (int queen = 0; queen < row; queen++) {
				if (position[queen].col == col || (position[queen].row + position[queen].col) == row + col
						|| (position[queen].row - position[queen].col) == row - col) {
					foundSafe = false;
				}
			}

			if (foundSafe) {
				position[row] = new Position(row, col);
				if (solveNQueen(n, row + 1, position)) {
					return true;
				}
			}
		}

		return false;
	}
}

class Position {
	int row;
	int col;

	public Position(int row, int col) {
		this.row = row;
		this.col = col;
	}

}