package LinkedList;

import java.util.EmptyStackException;

public class LinkedListImpl implements LinkedList {
	Node head = null;
	Node tail = null;
	private int size = 0;

	@Override
	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;

		if (head == null)// If head == null means it points nothing;
		{
			head = newNode;
			tail = newNode;
			// tail.next=something == newNode.next = something; cuz tail control newNode;
		} else// else Head points somthing;
		{

			newNode.next = head;
			head = newNode;
			// tail.next=newNode;//make old one point new one;
			// tail=newNode;//and tail moves to new one;(now it can manage);
		}

	}

	@Override
	public void addLast(int data) {
		if (tail == null)// if head Null just call addFisrt;
			addFirst(data);
		else// add it after Last
		{
			Node newNode = new Node(data);
			tail.next = newNode;// make old one point new one;
			tail = newNode;// and tail moves to new one;(now it can manage);
		}
		size++;
	}

	public void addMiddle(int data) {
		size++;
		/*
		 * 1.first find index of mid; 2.create finder_Node which move until finds the
		 * idx of mid; 3.using for syntax
		 */
		Node newNode = new Node(data);

		Node finder_Node = null;
		for (int loop = 0; loop < (size / 2) + 1; loop++) {
			finder_Node = head;
			head = head.next;
		}
		newNode.next = finder_Node.next;
		finder_Node.next = newNode;
		finder_Node = newNode;
	}

	@Override
	public void add(int index, int data) {
		if (index <=0 || index > size) {
			System.out.println("Out of size");
			return;
		}

		if (index == 1)
			addFirst(data);
		else if (index == size)
			addLast(data);
		else {
			Node prevNode = null;
			Node next=head;
			Node newNode = new Node(data);
			// 1 2 3 4
			//   p
			for (int loop = 0; loop < index - 1; loop++) 
			{
				prevNode=next;
				next=next.next;
			}
			prevNode.next=newNode;
			newNode.next=next;
			
		}
	}

	@Override
	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("There is nothing to remove");
		} else {
			head = head.next;
			size--;
		}
	}

	public void show() {
		if (head == null) {
			System.out.println("There is nothing to show");
		} else {
			int count = 1;
			Node finder = head;
			while (finder != null) {
				System.out.println("[" + (count++) + "]: " + finder.data + " ");
				head = head.next;
				finder = head;
			}
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public int get(int index) {
		if(index <=0 || size<index)
		{
			System.out.println("Out of size");
			throw new EmptyStackException();
		}
		Node finder=head;
		for(int loop=0;loop<index-1;loop++)
		{
			finder=finder.next;
		}
		return finder.data;
	}

	@Override
	public void remove(int index) {
		if(!isEmpty()) 
		{
			if(index == 1)
			{
				//head=head.next;
				//return;
				removeFirst();
				return;
			}
			if(index>=0 || size<index)
			{
				System.out.println("Out of index");
				return;
			}
			Node nextNode=head;
			Node cntNode=null;
			for(int loop=0;loop<index-1;loop++)
			{
				cntNode=nextNode;//.next;
				nextNode=cntNode.next;
			}
			cntNode.next=nextNode.next;
			nextNode=null;
			size--;
			return;
			
		}
		System.out.println("Empty list");
		return;
	}

	@Override
	public void removeLast() {
	
	if(!isEmpty())
	{
		if(size==1)
		{
			removeFirst();
			return;
		}
		Node nextNode=head;
		while(nextNode.next.next!=null)
		{
			nextNode=nextNode.next;
		}
		nextNode.next=null;
		tail=nextNode;
		return;
	}
	System.out.println("Empty list");
	return;
	}

	@Override
	public boolean isEmpty() {
		return size<=0? true:false;
	}
}
