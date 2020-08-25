package Java_Algo;

public class BinTree {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.insertTree(13);
		tree.insertTree(10);
		tree.insertTree(15);
		tree.insertTree(9);
		tree.insertTree(11);
		tree.insertTree(14);
		tree.insertTree(16);
		tree.insertTree(18);
		
		tree.searchValue(144);
		tree.showPre();

	}

	public static class Tree {

		private Node root = null;
		public void removeNode(int value) {
			this.root.deleteNode(value);
		}
		public void searchValue(int value) {
			this.root.findValue(value);
		}
		public void insertHeap(int data) {
			if (this.root == null) {
				this.root = new Node(data);
				return;
			}
			this.root.insertH(data);
		}

		public void insertTree(int data) {
			if (this.root == null) {
				this.root = new Node(data);
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
			//preOrder(root);
			inorder(root);
		}

		private void inorder(Node root) {
			if (root != null) {
				inorder(root.left);
				System.out.print(root.data + " ");
				inorder(root.right);
			}
		}

		private void postorder(Node root) {
			if (root != null) {
				postorder(root.left);
				postorder(root.right);
				System.out.print(root.data + " ");
			}
		}

		public void showIn() {
			inorder(root);
		}

		public void showPo() {
			postorder(root);
		}
	}

	public static class Node {
		protected int data;
		protected Node left;
		protected Node right;
		static int flag = 0;

		public Node(int data) {
			this.left = null;
			this.data = data;
			this.right = null;
		}
		public void deleteNode(int value) {
			Node node=this;
			while(node!=null) {
				if(node.data==value) {
					if(node.right ==null && node.left==null) {
						node=null;
						return;
					}else if(node.right==null && node.left!=null) {
						node=node.left;
						return;
					}else
						node=node.right;
				}
			}
		}
		public void findValue(int value) {
			Node node=this;
			while(node!=null) {
				if(node.data==value) {
					System.out.println("value found: "+node.data);
					return;
				}
				if(node.data<value) {
					node=node.right;
				}else node=node.left;
			}
			System.out.println("no value");
			return;
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
			if(value>this.data) {
				if(this.right==null) {
				this.right=new Node(value);
				return;
				}else
					this.right.insertT(value);
			}else {
				if(this.left==null) {
				this.left=new Node(value);
				return;
				}
				else {
					this.left.insertH(value);
				}
			}
		}
	}
}
