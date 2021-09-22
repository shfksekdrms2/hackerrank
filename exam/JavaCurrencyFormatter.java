package exam;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//Java Currency Formatter
public class JavaCurrencyFormatter {
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale locale = new Locale("en", "US");
		NumberFormat Format = NumberFormat.getCurrencyInstance(locale);
		System.out.println("US: " + Format.format(payment));
        
		locale = new Locale("en", "IN");
		Format = NumberFormat.getCurrencyInstance(locale);
		System.out.println("India: " + Format.format(payment));
		
		locale = new Locale("zh", "CN");
		Format = NumberFormat.getCurrencyInstance(locale);
		System.out.println("China: " + Format.format(payment));
		
		locale = new Locale("fr", "FR");
		Format = NumberFormat.getCurrencyInstance(locale);
		System.out.println("France: " + Format.format(payment));
	}
}
