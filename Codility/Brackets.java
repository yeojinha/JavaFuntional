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
				if(stack.isEmpty()) {//{([�� �ƴ� ��� ���� �Դµ�, push�� ����. �׷��ٸ� s.chat ���簡 t�̸� stack���� �ƹ��͵� ���� ��Ȳ
					// t�ΰ���� �̷� ��� (t)�� ��� ok������ t�� ���� ����
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
