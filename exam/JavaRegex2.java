package exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Java Regex 2
public class JavaRegex2 {
	public static void main(String[] args){
		// \\b: 단어의 경계
		// \\w+: 문자 1나 이상
		// \\W+: w+에서 정의하지 않은 문자 --> 문자가 아닌 것 (특수문자 등)
		// \\b: 단어의 경계
		// \\1: \w+ 동일한 문자열 찾기 
		//Pattern.CASE_INSENSITIVE: 대소문자 구별하지 않음.
		String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
	}
}
