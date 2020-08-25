package Queue;

import java.util.NoSuchElementException;

public class Queue {

	Node first=null;
	Node last=null;
	private int bowl=0;
	private int size=0;
	
	//FIFO FIRST가 먼저 나감
	
	public void Enqeue(int data)
	{
		Node newNode=new Node(data);
		/*
		if(last!=null)//if last node has data;
		{
			last.next=newNode;
		}
		last=newNode;
		if(first==null)//means having only one node; execute only one time;
		{
			first=last;
		}*/
		
		if(last==null)
		{
			last=newNode;
			first=newNode;
		}
		else
		{
			last.next=newNode;
			last=newNode;
		}
		size++;
		System.out.println(String.format("size: %d    data: %d", size,last.data));
	}
	
	public int Deqeue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		else
		{
			bowl=first.data;
			first=first.next;/// f - f.next - last    ->    f- last
			size--;
		}
		if(first==null)
		{
			last=null;
		}
		return bowl;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
	
	public int peak()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		return first.data;
	}
	public int getSize()
	{
		return size;
	}
	
}
