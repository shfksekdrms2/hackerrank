package hackerrank.hackerrank.JAVA.Strings.TagContentExtractor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/tag-content-extractor/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * Tag Content Extractor
 */
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		ArrayList<String> list = new ArrayList<>();
		HashMap<String, String> hm = new HashMap<>();
		while (testCases-- > 0) {
			String result = "None";
			String line = in.nextLine();
			while (line.indexOf("<") != -1) {
				int startFirstPosition = line.indexOf("<") + 1;
				int startSecondPosition = line.indexOf(">") + 1;
				// list.add(line.substring(startFirstPosition,
				// startSecondPosition));
				if (line.charAt(startFirstPosition + 1) == '/') {
					String tmp = line.substring(startFirstPosition + 1, startSecondPosition);
					if(hm.containsKey(tmp)){
						hm.remove(tmp);
					}else{
					}
				} else {
					String tmp = line.substring(startFirstPosition, startSecondPosition);
					if (hm.containsKey(tmp)) {
						// int endFirstPosition = line.indexOf("</") + 1;
						int endSecondPosition = line.indexOf(">") + 1;
						line = line.substring(endSecondPosition, line.length() + 1);
					} else {
						hm.put(tmp, "start");
						line = line.substring(startSecondPosition + 1, line.length()+ 1);
					}
				}
				// line = line.substring(startSecondPosition, line.length());
				System.out.println(line);
			}
//			result = line;

		}
	}
}
