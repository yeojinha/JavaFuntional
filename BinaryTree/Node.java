package BinaryTree;

public class Node {
	protected int data;
	protected Node left;
	protected Node right;
	static int flag=0;
	public Node(int data) {
		this.left = null;
		this.data = data;
		this.right = null;
	}

	public void insertH(int value) {
		if (this.data >= value) {
			if (this.left == null)
				this.left = new Node(value);
			else
				this.left.insertH(value);
		} else if (this.data < value) {
			if (this.right == null)
				this.right = new Node(value);
			else
				this.right.insertH(value);
		}
	}
	
	public void insertT(int value) {
			if(this.left==null && flag!=1)
			{
				flag=1;
				this.left=new Node(value);
			}else if(this.right==null && flag !=2){
				flag=2;
				this.right=new Node(value);
			}else if(this.left!=null &&flag!=1)
			{
				this.left.insertT(value);
			}else if(this.right!=null &&flag!=2) {
				this.right.insertT(value);
			}
	}
}
