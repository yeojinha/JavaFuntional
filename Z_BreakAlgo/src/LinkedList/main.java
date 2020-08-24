package LinkedList;

public class main {

	public static void main(String[] args) {
		LinkedListImpl list = new LinkedListImpl();
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.add(7, 0);
		list.show();
	}

}
