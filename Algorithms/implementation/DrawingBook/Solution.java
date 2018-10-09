package hackerrank.hackerrank.Algorithms.implementation.DrawingBook;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/drawing-book/problem
 * Drawing Book
 */
public class Solution {
	static int pageCount(int n, int p) {
		/*
		 * Write your code here.
		 */
//		System.out.println("p/2: " + (p / 2));
//		System.out.println("((n + 1) - p) / 2: " + (((n + 1) - p) / 2));
//		System.out.println("(n - p) / 2: " + ((n - p) / 2));
		int cnt = Integer.min(p / 2, n % 2 == 0 ? ((n + 1) - p) / 2 : (n - p) / 2);
		return cnt;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int p = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int result = pageCount(n, p);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();
		System.out.println(String.valueOf(result));
		// bufferedWriter.close();

		scanner.close();
	}
}
