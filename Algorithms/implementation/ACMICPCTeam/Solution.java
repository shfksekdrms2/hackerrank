package hackerrank.hackerrank.Algorithms.implementation.ACMICPCTeam;

import java.io.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/acm-icpc-team/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * ACM ICPC Team
 */
public class Solution {
	static int[] acmTeam(String[] topic) {
		int[] result = new int[2];
		byte[] maxNumber = new byte[topic.length];
		int cnt = 0;
		for (int i = 0; i < topic.length - 1; i++) {
			// int before = Integer.valueOf(topic[i]);
			byte[] before = ByteBuffer.allocate(4).putInt(Integer.valueOf(topic[i])).array();
			cnt = 0;
			// System.out.println(before);
			System.out.println("-------");
			for (byte b : before) {
				System.out.print(b);
			}
			System.out.println();
			System.out.println("-------");
//			 System.out.println("before: "+ before);
			for (int j = i + 1; j < topic.length; j++) {
				// int after = Integer.valueOf(topic[j]);
				byte[] after = ByteBuffer.allocate(4).putInt(Integer.valueOf(topic[j])).array();
				for (int k = 0; k < topic.length; k++) {
					System.out.println("before[i]: "+ before[i]);
					System.out.println("after[j]: "+ after[j]);
					if (before[i] == 1 && after[j] == 1) {
						cnt++;
						System.out.println("enter");
					}
				}
				maxNumber[cnt]++;
				// System.out.println("after: "+ after);
				// System.out.println("------------");
//				 System.out.println("cnt: "+ cnt);
			}
		}

		for (int i = topic.length - 1; i >= 0; i--) {
			if (maxNumber[i] != 0) {
				result[0] = maxNumber[i];
				result[1] = i + 1;
				break;
			}
		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		String[] topic = new String[n];

		for (int i = 0; i < n; i++) {
			String topicItem = scanner.nextLine();
			topic[i] = topicItem;
		}

		int[] result = acmTeam(topic);

		for (int i = 0; i < result.length; i++) {
			// bufferedWriter.write(String.valueOf(result[i]));
			System.out.println(String.valueOf(result[i]));

			if (i != result.length - 1) {
				// bufferedWriter.write("\n");
			}
		}

		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
