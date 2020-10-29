package Codility;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{[()()]}";
		System.out.println(solution(s));
	}
	public static int solution(String s) {
		Stack<Character> stack=new Stack();
		
		if(s.length()<=0) {
			return 1;
		}
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='{' || s.charAt(i)=='(' ||s.charAt(i)=='[') {
				stack.push(s.charAt(i));
			}else {
				if(stack.isEmpty()) {//{([이 아닌 경우 여기 왔는데, push가 없다. 그렇다면 s.chat 현재가 t이며 stack에는 아무것도 없는 상황
					// t인경우임 이런 경우 (t)의 경우 ok이지만 t인 경우는 ㄴㄴ
					return 0;
				}
				if(stack.peek()=='(' && s.charAt(i)==')')
					stack.pop();
				else if(stack.peek()=='{' && s.charAt(i)=='}')
					stack.pop();
				else if(stack.peek()=='[' && s.charAt(i)==']')
					stack.pop();
			}
		}
		
		
		if(stack.isEmpty())
			return 1;
		else return 0;
		
	}

}
