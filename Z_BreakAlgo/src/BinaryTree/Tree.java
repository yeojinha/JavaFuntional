package BinaryTree;

public class Tree {

	private Node root = null;

	public void insertHeap(int data) {
		if (this.root == null) {
			this.root = new Node(data);
			return;
		}
		this.root.insertH(data);
	}
	public void insertTree(int data)
	{
		if(this.root==null) {
			this.root=new Node(data);
			return;
		}
		this.root.insertT(data);
	}

	private void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println("value: " + root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public void showPre() {
		preOrder(root);
	}
    private void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    
    private void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
	public void showIn()
	{
		inorder(root);
	}
	public void showPo()
	{
		postorder(root);
	}
}
