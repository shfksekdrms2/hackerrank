package hackerrank.hackerrank.DataStructurs.Heap.JessAndCookies;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/jesse-and-cookies/problem
 * Jesse and Cookies
 */
public class Solution {
	/*
	 * Complete the cookies function below.
	 */
	static int cookies(int k, int[] A) {
		/*
		 * Write your code here.
		 */
		int result = 0, first, second;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < A.length; i++) {
			pq.add(A[i]);
		}
		while (pq.peek() < k) {
			if (pq.size() < 2) {
				result = -1;
				break;
			}
			first = pq.poll();
			second = pq.poll();
			pq.add(1 * first + 2 * second);
			result++;
		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0].trim());

		int k = Integer.parseInt(nk[1].trim());

		int[] A = new int[n];

		String[] AItems = scanner.nextLine().split(" ");

		for (int AItr = 0; AItr < n; AItr++) {
			int AItem = Integer.parseInt(AItems[AItr].trim());
			A[AItr] = AItem;
		}

		int result = cookies(k, A);

		System.out.println(result);
		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();
		//
		// bufferedWriter.close();
	}
}
