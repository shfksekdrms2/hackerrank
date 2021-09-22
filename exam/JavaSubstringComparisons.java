package exam;

import java.util.Arrays;
import java.util.Scanner;

//Java Substring Comparisons
public class JavaSubstringComparisons {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] str = new String[s.length()-k+1];
        int i;
        for(i=0; i<str.length; i++){
        	str[i] = s.substring(i, i+k);
        }
        Arrays.sort(str);
        smallest = str[0];
        largest = str[str.length-1];
        
        return smallest + "\n" + largest;
    }
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}
}
