package com.deb.ds.core.graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	// Leetcode-127 - https://leetcode.com/problems/word-ladder/
	public static void main(String[] args) {

		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
		System.out.println("No Of Changes: " + ladderLength(beginWord, endWord, wordList));
	}

	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

		Set<String> words = new HashSet<>(wordList);
		if (!words.contains(endWord))
			return -1;

		Queue<String> queue = new LinkedList<>();
		Queue<String> isVisited = new LinkedList<>();
		queue.add(beginWord);
		isVisited.add(beginWord);
		int changes = 1;

		while (!queue.isEmpty()) {

			for (int i = 0; i < queue.size(); i++) {
				String word = queue.poll();
				if (word.equals(endWord))
					return changes;

				for (int j = 0; j < word.length(); j++) {
					for (int k = 'a'; k <= 'z'; k++) {
						char[] data = word.toCharArray();
						data[j] = (char) k;
						String newWord = new String(data);
						if (words.contains(newWord) && !isVisited.contains(newWord)) {
							queue.add(newWord);
							isVisited.add(newWord);
						}
					}
				}
			}
			changes++;
		}
		return -1;
	}
}
