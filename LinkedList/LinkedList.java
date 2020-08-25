package LinkedList;

public interface LinkedList {
	public int getSize();

	public void add(int index, int data);

	public void addFirst(int data);

	public void addLast(int data);

	public int get(int index);

	public void remove(int index);

	public void removeFirst();

	public void removeLast();

	public boolean isEmpty();
}
