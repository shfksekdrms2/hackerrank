package hackerrank.hackerrank;

import java.util.Scanner;

//Java Regex
public class JavaRegex {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
	}
}

class MyRegex{
	public static String pattern = "(([0-2]{0,1}[0-5]{0,2}|[0-2]{0,1}[0-4]{0,1}[0-9]{0,1}|[0-9]{1,2})\\.){3}"
			+ "([0-2]{0,1}[0-5]{0,2}|[0-2]{0,1}[0-4]{0,1}[0-9]{0,1}|[0-9]{1,2})";
}