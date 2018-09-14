package hackerrank.hackerrank.DataStructurs.Arrays.DynamicArray;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 * https://www.hackerrank.com/challenges/dynamic-array/problem
 * Dynamic Array
 */
public class Solution {
	// Complete the dynamicArray function below.
	static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> subList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			subList.add(new ArrayList<Integer>());
		}
		int lastAnswer = 0, beforeLastAnswer = 0;;
		for (List<Integer> subquerie : queries) {
			if (subquerie.get(0) == 1) {
				subList.get((subquerie.get(1) + lastAnswer) % n).add(subquerie.get(2));
			} else {
				beforeLastAnswer = (subquerie.get(1) + lastAnswer) % n;
//				System.out.println("subList.get(lastAnswer).size(): "+ subList.get(lastAnswer).size());
				if(subList.get(beforeLastAnswer).size() != 0){
					lastAnswer = beforeLastAnswer;
					list.add(subList.get(lastAnswer).get(subList.get(lastAnswer).size() - 1));
					System.out.println("lastAnswer: " + lastAnswer);
				}
			}

			for (int i = 0; i < subList.size(); i++) {
				for (int j = 0; j < subList.get(i).size(); j++) {
					System.out.print(subList.get(i).get(j) + " ");
				}
				System.out.println();
			}
			System.out.println("----------------");
		}

		return list;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(nq[0]);

		int q = Integer.parseInt(nq[1]);

		List<List<Integer>> queries = new ArrayList<>();

		for (int i = 0; i < q; i++) {
			String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> queriesRowItems = new ArrayList<>();

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
				queriesRowItems.add(queriesItem);
			}

			queries.add(queriesRowItems);
		}

		List<Integer> result = dynamicArray(n, queries);

		for (int i = 0; i < result.size(); i++) {
			// bufferedWriter.write();
			System.out.println(String.valueOf(result.get(i)));

			if (i != result.size() - 1) {
				// bufferedWriter.write("\n");
				System.out.println();
			}
		}

		// bufferedWriter.newLine();
		//
		// bufferedReader.close();
		// bufferedWriter.close();
	}
}
