package com.deb.ds.core.array;

public class BuySellStock {

	/*
	 * Leetcode-121 You are given an array prices where prices[i] is the price of a
	 * given stock on the ith day.
	 * 
	 * You want to maximize your profit by choosing a single day to buy one stock
	 * and choosing a different day in the future to sell that stock.
	 * 
	 * Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1)
	 * and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2
	 * and selling on day 1 is not allowed because you must buy before you sell.
	 */

	public static void main(String[] args) {
		int prices[] = { 7, 1, 5, 3, 6, 4 };

		int maxProfit = Integer.MIN_VALUE;
		int buyPrice = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			// Determine Least buy Price
			buyPrice = Math.min(buyPrice, prices[i]);
			// Determine Max Profit
			maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
		}
		System.out.println("Display Max Profit:" + maxProfit);
	}
}
