package exam;

import java.util.LinkedList;
import java.util.Scanner;

public class BalancedBrackets {
	static String isBalanced(String s) {
        // Complete this function
		String str= new String();
		int i, j;
		int last;
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		for(j=0; j<s.length(); j++){
			if(s.charAt(j) == '('){
				stack.add(1);
			}else if(s.charAt(j) == ')'){
				if(!stack.isEmpty()){
					last = stack.getLast(); 
					if(last == 1){
						stack.removeLast();
					}else{
						str = "NO";
						break;
					}
				}else{
					str = "NO";
					break;
				}
			}else if(s.charAt(j) == '{'){
				stack.add(2);
			}else if(s.charAt(j) == '}'){
				if(!stack.isEmpty()){
					last = stack.getLast(); 
					if(last == 2){
						stack.removeLast();
					}else{
						str = "NO";
						break;
					}
				}else{
					str = "NO";
					break;
				}
			}else if(s.charAt(j) == '['){
				stack.add(3);
			}else if(s.charAt(j) == ']'){
				if(!stack.isEmpty()){
					last = stack.getLast(); 
					if(last == 3){
						stack.removeLast();
					}else{
						str = "NO";
						break;
					}
				}else{
					str = "NO";
					break;
				}
			}
		}
		if(!stack.isEmpty()){
			str = "NO";
		}else if(stack.isEmpty() && j == s.length()){
			str = "YES";
		}
		return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
