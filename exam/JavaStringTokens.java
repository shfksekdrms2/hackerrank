package exam;

import java.util.Scanner;

//Java String Tokens
public class JavaStringTokens {
	public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.replaceAll("'|,|_|\\.|!|\\?|@", " ");
//        System.out.println("s: "+s);
        int i, cnt=0;
        String[] arr = s.split(" ");
        for(i=0; i<arr.length; i++){
        	if(!arr[i].equals("")){
        		cnt++;
        	}
        }
        System.out.println(cnt);
        for(i=0; i<arr.length; i++){
        	if(!arr[i].equals("")){
        		System.out.println(arr[i]);
        	}
        }
        
        scan.close();
	}
}
