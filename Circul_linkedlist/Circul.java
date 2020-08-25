package Circul_linkedlist;

public class Circul <T>{

	private int size;
	Node<T> last=null;
	public void add(T data)
	{
		Node<T> temp=new Node(data);
		if(size==0)
		{
			last=temp;
		}
		else
		{
			temp.next=last.next;	
		}
		last.next=temp;
		size++;
		return;
	}
	public void show()
	{
		if(size==0)
		{
			System.out.println("size is zero");
			return;
		}
		Node<T> cnt=last.next;
		while(cnt!=last)
		{
			System.out.printf("%d -> ",cnt.data);
			cnt=cnt.next;
		}
		System.out.printf("%d",last.data);
	}
	
}
