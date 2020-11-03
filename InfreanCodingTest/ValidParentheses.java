package InfreanCodingTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String test="([}}])";
		System.out.println(solve_1(test));
		System.out.println(isValid_map(test));
	}
	public static boolean solve_1(String test) {
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<test.length();i++) {
			char op=test.charAt(i);
			switch(op) {
			case ')':
				if(!stack.isEmpty() && stack.peek()=='(') {
					stack.pop();
				}else stack.push(op);
				break;
			case ']':
				if(!stack.isEmpty() && stack.peek()=='[') {
					stack.pop();
				}else stack.push(op);
				break;
			case '}':
				if(!stack.isEmpty() && stack.peek()=='{') {
					stack.pop();
				}else stack.push(op);
				break;
			default:
				stack.push(op);
				break;
			}
		}
		return stack.isEmpty();
	}
	public static boolean solve_2(String s) {
		if(s.length()%2!=0)//È¦¼ö¸é false;
			return false;
		//String test="([}}])";
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char op=s.charAt(i);
			switch(op) {
			case ')':
				if(!stack.isEmpty() && stack.peek()=='(') {
					stack.pop();
				}
				break;
			case ']':
				if(!stack.isEmpty() && stack.peek()=='[') {
					stack.pop();
				}
				break;
			case '}':
				if(!stack.isEmpty() && stack.peek()=='{') {
					stack.pop();
				}
				break;
				
			default:
				stack.push(s.charAt((i)));
				break;
			}
		}
		return stack.isEmpty();
	}
	public static boolean isValid_map(String str) {
		Map<Character, Character> map = new HashMap<>();
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				stack.push(c);
			}else if(map.containsValue(c)) {
				if(!stack.isEmpty() && map.get(stack.peek())==c) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
