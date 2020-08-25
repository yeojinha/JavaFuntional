package BinaryTree;

public class TreeMain {

	public static void main(String[] args) {
		Tree heap = new Tree();
		heap.insertHeap(10);
		heap.insertHeap(7);
		heap.insertHeap(5);
		heap.insertHeap(3);
		heap.insertHeap(2);
		heap.insertHeap(11);
		heap.insertHeap(13);
		
		heap.showPre();
		
		System.out.println("----------------------------");
		
		Tree tree=new Tree();
		
		tree.insertTree(10);
		tree.insertTree(7);
		tree.insertTree(5);
		tree.insertTree(3);
		tree.insertTree(2);
		tree.insertTree(11);
		tree.insertTree(13);
		
		tree.showPre();
	}
}
