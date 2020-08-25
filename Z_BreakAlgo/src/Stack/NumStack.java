package Stack;

public class NumStack {

	int [] arr;
	int top=0;
	NumStack(int size)
	{
		this.arr=new int [size];
	}
	public void push(int data)
	{
		if(top<arr.length)
		{
			arr[top++]=data;//후연산으로 두어야함.
			System.out.println(String.format("arr[%d]: %d", top,arr[top-1]));
		}
		else
		{
			System.out.println("Stack Overflow");
			return;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			throw new java.util.EmptyStackException();
		}
		else
		{
			top--;
			return arr[top];
		}
	}
	public int peak()
	{
		if(!isEmpty())
			return arr[top];
		else
			throw new java.util.EmptyStackException();
	}
	public void show()
	{
		if(!isEmpty())
			for(int i=0;i<top;i++)
			{
			System.out.println(arr[i]+" ");
			}
		else
			System.out.println("Stack is Empty");
	}
	public boolean isEmpty()
	{
		return top<=0? true:false;
	}
	
	public int getSize()
	{
		return top;
	}
}
