package exam;

import java.util.ArrayList;
import java.util.Scanner;

//Java Arraylist
public class JavaArraylist {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>[] arr = new ArrayList[n];
		
		
		for(int i=0; i<n; i++){
			int input = sc.nextInt();
			arr[i] = new ArrayList<>();
			while(input-- > 0){
				int value = sc.nextInt();
				arr[i].add(value);
			}
		}
		
		int q = sc.nextInt();
		while(q-- > 0){
			int row = sc.nextInt()-1;
			int col = sc.nextInt()-1;
			try{
				System.out.println(arr[row].get(col));
			}catch(Exception e){
				System.out.println("ERROR!");
			}
		}
	}
}
