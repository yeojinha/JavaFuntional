package Dequeue;

import java.util.EmptyStackException;

public class Dequeue<T> {
	private int size=0;
	
	private Node<T> front;
	private Node<T> rear;
	
	
	public void addFront(T data)
	{
		Node <T>newNode=new Node(data);
		if(isEmpty())
		{
		size++;//size up;
		front=newNode;
		rear=newNode;
		front.next=rear.next=null;
		return ;
		}
		size++;//size up;
		newNode.next=front;
		front=newNode;
	
		return;
	}
	public void addRear(T data)
	{
		
		Node<T> newNode=new Node(data);
		if(isEmpty())
		{
			size++;//size up;
			rear=newNode;
			front=newNode;
			front.next=rear.next=null;
			return;
		}
		size++;//size up;
		/*Node <T> crt=front;
		while(crt.next!=null)
		{
			crt=crt.next;
		}
		rear=crt.next=newNode;
		rear.next=null;
		*/
		rear.next=newNode;
		rear=newNode;
		return;
	}
	public T DeleteFront()
	{
		if(isEmpty())
		{

			System.out.println("Empty!");
			throw new EmptyStackException();
		}
		
		if(size==1)//rear==front;
		{

			size--;//size down;
			T temp=front.getData();
			front=null;
			rear=null;
			return temp;
		}
		size--;//size down;
		T temp=front.getData();
		front=front.next;
		
		return temp;
	}
	public T Deleterear()
	{
		if(isEmpty())
		{
			System.out.println("Empty!");
			throw new EmptyStackException();
		}
		if(size==1)
		{
			size--;//size down;
			T temp=rear.getData();
			rear=null;
			front=null;
			return temp;
		}
		Node <T> crt=front;
		while(crt.next.next!=null)
		{
			crt=crt.next;
		}
		size--;//size down;
		T temp=crt.next.getData();
		rear=crt;
		crt.next=null;
		return temp;
	}
	
	public void show()
	{
		Node <T> cnt=front;
		while(cnt!=null)
		{
			System.out.printf("[%d] -> ",cnt.getData());
			cnt=cnt.next;
		}
		System.out.println(" NULL");
		return;
	}
	
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size<=0? true:false;
	}
}
