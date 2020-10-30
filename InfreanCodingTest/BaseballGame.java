package InfreanCodingTest;

import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
		String []input= {"5","-2","4","C","D","9","+","+"};
		System.out.println(solution(input));

	}
	public static int solution(String []input) {
		Stack<Integer> stack=new Stack<Integer>();
		int ans=0;
		
		for(String op:input) {
			switch(op){
			case "C":
				stack.pop();
				break;
			case "D":
				stack.push(stack.peek()*2);
				break;
			case "+":
				int over=stack.pop();
				int under=stack.pop();
				stack.push(under);
				stack.push(over);
				stack.push(over+under);
				break;
			default:
				stack.push(Integer.valueOf(op));
				break;
			}
		}
		while(!stack.isEmpty()) {
			ans+=stack.pop();
		}
		return ans;
	}
}
