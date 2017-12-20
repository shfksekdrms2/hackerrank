package hackerrank.hackerrank;
import java.util.Scanner;

//Java Stdin and Stdout II
public class JavaStdinandStdout2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();scan.nextLine();			//개행 문자 제거
        double d = scan.nextDouble();scan.nextLine();	//개행 문자 제거
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
