package hackerrank.hackerrank.Algorithms.implementation.SequenceEquation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/permutation-equation/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * Sequence Equation
 */
public class Solution {
	static int[] permutationEquation(int[] p) {
		int[] result = new int[p.length];

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if (p[p[i] - 1] == p[j]) {
					result[p[p[i] - 1] - 1] = i + 1;
					break;
				}
			}

		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] p = new int[n];

		String[] pItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int pItem = Integer.parseInt(pItems[i]);
			p[i] = pItem;
		}

		int[] result = permutationEquation(p);

		for (int i = 0; i < result.length; i++) {
			// bufferedWriter.write(String.valueOf(result[i]));
			System.out.println(String.valueOf(result[i]));

			// if (i != result.length - 1) {
			// bufferedWriter.write("\n");
			// }
		}

		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
