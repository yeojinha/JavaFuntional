package Stack;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		Scanner std= new Scanner(System.in);
		int size=5;
		/*
		 * System.out.println("What size?");
		 * int size=std.nextInt();
		 */
		NumStack stack=new NumStack(size);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		stack.show();
		System.out.println("size: "+stack.getSize());
		System.out.println("------------------------");
		System.out.println("pop: "+stack.pop());
		System.out.println("pop: "+stack.pop());
		System.out.println("pop: "+stack.pop());
		System.out.println("pop: "+stack.pop());
		System.out.println("pop: "+stack.pop());
		stack.push(1);
		stack.show();
		System.out.println("Size: "+stack.getSize());
	
	}

}
