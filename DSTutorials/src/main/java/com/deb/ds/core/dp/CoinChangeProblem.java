package com.deb.ds.core.dp;

import java.util.HashMap;
import java.util.Map;

public class CoinChangeProblem {

	public static void main(String[] args) {
		
		int coins[]={ 1, 3, 5, 7 };
		int target =10;
		Map<Integer, Integer> map = new HashMap<>();
		System.out.println("Result: "+findMinCoin(coins, target, map));
	}

	private static int findMinCoin(int coins[], int target, Map<Integer, Integer> map) {

		if (target == 0)
			return 0;

		if (map.containsKey(target))
			return map.get(target);

		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i++) {

			if (coins[i] > target)
				continue;

			int value = findMinCoin(coins, target - coins[i], map);
			minValue = Math.min(minValue, value);
		}
		minValue = (minValue != Integer.MAX_VALUE) ? minValue+1 : Integer.MAX_VALUE;
		map.put(target, minValue);
		
		return minValue;
	}
}
