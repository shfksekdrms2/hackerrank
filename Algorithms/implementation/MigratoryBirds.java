package hackerrank.hackerrank.Algorithms.implementation;

import java.util.Scanner;

//Migratory Birds
public class MigratoryBirds {
	static int migratoryBirds(int n, int[] ar) {
		int[] cntArr = new int[5];
		for (int i = 0; i < n; i++) {
			cntArr[ar[i] - 1]++;
		}
		int result = 1;
		for (int i = 1; i < cntArr.length; i++) {
			if (cntArr[result - 1] < cntArr[i]) {
				result = i + 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = migratoryBirds(n, ar);
		System.out.println(result);
	}
}
