package exam;

import java.util.Scanner;

//Java Strings Introduction
public class JavaStringsIntroduction {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int i;
        if(A.length() > B.length()){
        	for(i=0; i<B.length(); i++){
        		if(A.charAt(i) != B.charAt(i)){
        			if(A.charAt(i) < B.charAt(i)){
        				System.out.println("No");
        			}else{
        				System.out.println("Yes");
        			}
        			break;
        		}
        	}
        	if(i == B.length()){
				System.out.println("No");
        	}
        }else{
        	for(i=0; i<A.length(); i++){
        		if(A.charAt(i) != B.charAt(i)){
        			if(A.charAt(i) < B.charAt(i)){
        				System.out.println("No");
        			}else{
        				System.out.println("Yes");
        			}
        			break;
        		}
        	}
        	if(i == A.length()){
				System.out.println("No");
        	}
        }

        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        arrA[0] -= 32;
        arrB[0] -= 32;
        System.out.println(String.valueOf(arrA)+" "+String.valueOf(arrB));
	}
}
