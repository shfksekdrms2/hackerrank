package hackerrank.hackerrank.Algorithms.implementation.EqualizeTheArray;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/equality-in-a-array/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * Equalize the Array
 */
public class Solution {
	static int equalizeArray(int[] arr) {
		boolean[] number = new boolean[101];
		int cnt = 0;
		int minValue = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++){
			cnt = 0;
			if(number[arr[i]] == false){
				for(int j=0; j<arr.length; j++){
					if(arr[i] != arr[j]){
						cnt++;
					}
				}
			}
			minValue = Integer.min(minValue, cnt);
		}

		return minValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

//        bufferedWriter.write(String.valueOf(result));
        System.out.println(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
