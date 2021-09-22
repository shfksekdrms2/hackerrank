package exam;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Closest Numbers
public class ClosestNumbers {
	static int[] closestNumbers(int[] arr) {
		// Complete this function
		ArrayList<Integer> list = new ArrayList<>();

		Arrays.sort(arr);
		int minValue = Integer.MAX_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] < minValue) {
				minValue = arr[i] - arr[i - 1];
			}
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] == minValue) {
				list.add(arr[i - 1]);
				list.add(arr[i]);
			}
		}
		
		int[] result = list.stream().mapToInt(Integer::intValue).toArray();
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int[] result = closestNumbers(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
