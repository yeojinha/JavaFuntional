package InfreanCodingTest;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		System.out.println(solution("(()("));

	}
	public static boolean solution(String s) {
		boolean answer=true;
		
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(')
				stack.push(s.charAt(i));
			else {// ) �϶�
				if(!stack.isEmpty()) {
					stack.pop();
				}else {
					answer=false;//����ִµ�, )�̸� �װ��� false��� ��
					break;
				}
			}
			
		}
		if(!stack.isEmpty()) {//
			answer=false;
		}
		return answer;
	}

}
