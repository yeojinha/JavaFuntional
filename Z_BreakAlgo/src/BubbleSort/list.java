package BubbleSort;

public class list {
	private Node head = null, tail = null;
	public int size = 0;

	public void BubbleSort()
	{
		if(size>0){
			for(int i=0;i<size-1;i++)
			{
				Node cnt=head;
				for(int j=0;j<size-i-1;j++)
				{
					if(cnt.data>cnt.right.data)
					{
						swap(cnt,cnt.right);
					}
					cnt=cnt.right;
				}
			}
		}else
		{
			System.out.println("List is Empty");
		}
	}
	public void swap(Node a, Node b)
	{
		int temp;
		if(a.data>b.data)
		{
			temp=a.data;
			a.data=b.data;
			b.data=temp;
		}
	}
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (size > 0) {
			newNode.right = head;
			head.left = newNode;
		}
		head = newNode;

		if (head.right == null)// 처음 add했을 떄만 작동함.
		{
			tail = head;
		}
		size++;
	}

	public void addLast(int data) {
		if (size == 0) {
			addFirst(data);
		} else {
			Node newNode = new Node(data);
			tail.right = newNode;
			newNode.left = tail;
			tail = newNode;
			size++;
		}
	}

	public void add(int data, int idx) {
		if (idx > 0 && size >= idx) {// 0보다 크고 size보다 같거나 작아야 발동
			if (idx == 1) {
				addFirst(data);
			} else if (idx == size) {
				addLast(data);
			} else {
				Node newNode = new Node(data);
				size++;
				int i = 1;
				Node cnt = head;
				while (i != idx) {
					i++;
					cnt = cnt.right;
				}
				newNode.left = cnt.left;
				cnt.left.right = newNode;
				cnt.left = newNode;
				newNode.right = cnt;
			}
		}
	}

	public void removeFirst() {
		if (size == 0) {
			System.out.println("Nothing to return");
		} else {
			int value = head.data;
			head = head.right;
			size--;
			System.out.println("Removed FirstValue is " + value);
		}
		return;
	}

	public void removeLast() {
	
		if (size == 0) {
			System.out.println("Nothing to return");
		} else {
			int value = tail.data;
			tail = tail.left;
			tail.right=null;
			size--;
			System.out.println("Removed LastValue is " + value);
		}
		return;
	}

	public void remove(int idx)
	{
		
		if(idx>=0 && idx<=size)
		{
			int value=0;
			if(idx==0)
				System.out.println("Nothing to return");
			else if(idx==size)
			{
				removeLast();
			}else {
				int i=1;
				Node cnt=head;
				while(i!=idx)
				{
					cnt=cnt.right;
					i++;
				}
				System.out.println("Removed Value is " + cnt.data);
				cnt.left.right=cnt.right;
				cnt.right.left=cnt.left;
				size--;
			}
		}
	}
	public void show()
	{
		System.out.println("-------------------------");
		Node cnt=head;
		while(cnt!=null)
		{
			System.out.printf("%d ",cnt.data);
			cnt=cnt.right;
		}
		System.out.println();
	}
}
