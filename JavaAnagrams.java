package hackerrank.hackerrank;

import java.util.Scanner;

//Java Anagrams
public class JavaAnagrams {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
		boolean result=true;
		int[][] cnt = new int[26][2];
		int i;
		//둘다 소문자로 변경
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.length() != b.length()){
			return false;
		}
		for(i=0; i<a.length(); i++){
			cnt[a.charAt(i)-97][0]++;
			cnt[b.charAt(i)-97][1]++;
		}
		for(i=0; i<cnt.length; i++){
			if(cnt[i][0] != cnt[i][1]){
				result = false;
			}
		}
		return result;
    }
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
