package com.deb.ds.core.gready;

import java.util.Arrays;

public class CoinChangeProblem {

	public static void main(String[] args) {

		int coin[] = { 1, 2, 5, 10, 20, 100, 500, 50 };
		int target = 2035;
		System.out.println("No of Coin: " + findNoOfCoins(coin, target));

		System.out.println("Negative Scenario with Gredy");
		int coins[] = { 1, 5, 6, 8 };
		target = 11;
		System.out.println("No of Coin: " + findNoOfCoins(coins, target));
	}

	private static int findNoOfCoins(int coin[], int target) {

		Arrays.sort(coin);
		int index = coin.length - 1;
		int total = 0;
		while (true) {
			int coinValue = coin[index];
			index--;
			if (target >= coinValue) {
				int noOfCoin = target / coinValue;
				System.out.println("Coinvalue: " + coinValue + " No Of Coin: " + noOfCoin);
				target -= coinValue * noOfCoin;
				total += noOfCoin;
			}

			if (target <= 0) {
				break;
			}
		}
		return total;
	}
}
