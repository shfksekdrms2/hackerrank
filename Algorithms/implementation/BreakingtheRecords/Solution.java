package hackerrank.hackerrank.Algorithms.implementation.BreakingtheRecords;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 * Breaking the Records
 */
public class Solution {
	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {
		int[] result = new int[2];

		int maxValue, minValue;
		maxValue = minValue = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > maxValue) {
				result[0]++;
				maxValue = scores[i];
			}
			if (scores[i] < minValue) {
				result[1]++;
				minValue = scores[i];
			}
		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();

		int[] scores = new int[n];

		for (int i = 0; i < n; i++) {
			int scoresItem = scanner.nextInt();
			scores[i] = scoresItem;
		}

		int[] result = breakingRecords(scores);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

		scanner.close();
	}
}
