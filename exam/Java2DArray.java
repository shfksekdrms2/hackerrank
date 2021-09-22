package exam;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java2DArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int sum = Integer.MIN_VALUE;
		int value;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (sum < (value = hourGlass(arr, i, j))) {
					sum = value;
				}
			}
		}
		System.out.println(sum);
	}

	static int hourGlass(int arr[][], int i, int j) {
		return arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1]
				+ arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
	}
}
