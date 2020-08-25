package AVL_Tree;

import java.util.Comparator;

public class BinTree<key, value> {

	static class Node<key, value> {
		private key k;
		private value v;
		private Node<key, value> left;
		private Node<key, value> right;

		Node(key k, value v, Node<key, value> left, Node<key, value> right) {
			this.k = k;
			this.v = v;
			this.left = left;
			this.right = right;
		}

		key getKey() {
			return k;
		}

		value getValue() {
			return v;
		}

		void print()// value print
		{
			System.out.println(v);
		}
	}// Node class

	private Node<key, value> root;
	private Comparator<? super key> comparator = null;// 비교자

	public BinTree() {
		root = null;
	}

	public BinTree(Comparator<? super key> c) {
		this();// defualt 생성자를 실행
		comparator = c;// comparator를 c로 설정
	}

	private int comp(key k1, key k2) {
		return (comparator == null) ? ((Comparable<key>) k1).compareTo(k2)// k1을 Comparable 인터페이스로 형변환
				: comparator.compare(k1, k2);
	}

	public value search(key k) {

		// recursive를 이용

		Node<key, value> p = root;

		while (true) {
			if (p == null)
				return null;
			int cont = comp(k, p.getKey());// 비교자 사용하여 값 받음
			if (cont == 0)
				return p.getValue();// 같은 경우 해당하는 value를 반환
			else if (cont < 0)
				p = p.left;// left로 이동함.
			else
				p = p.right;// 아니면 right로 이동함.
		}
	}

	public void addNode(Node<key, value> node, key k, value v) {
		int cond = comp(k, node.getKey());
		if (cond == 0)
			return;
		else if (cond < 0) {
			if (node.left == null) {
				node.left = new Node<key, value>(k, v, null, null);
			} else {
				addNode(node.left, k, v);
			}
		} else {
			if (node.right == null)
				node.right = new Node<key, value>(k, v, null, null);
			else
				addNode(node.right, k, v);
		}
	}

	public void add(key k, value v) {
		if (root == null) {
			root = new Node<key, value>(k, v, null, null);
		} else {
			addNode(root, k, v);
		}
	}

	public boolean remove(key k) {
		Node<key, value> p = root;// root로 설정
		Node<key, value> parent = null;
		boolean isLeftChild = true;

		while (true) {// 삭제하고자 하는 key를 발견할 때 까지 loop
			if (p == null) {// root가 null인 경운
				return false;
			}
			int cond = comp(k, p.getKey());// 입력한 k와 p의 k 비교

			if (cond == 0)
				break;// 같으면 break;
			else {
				parent = p;// root로 설정
				if (cond < 0) {// 왼쪽이면
					isLeftChild = true;
					p = p.left;// p를 왼쪽으로 바꿈
				} else {
					isLeftChild = false;
					p = p.right;
				}
			}
		}

		if (p.left == null) {// 왼쪽이 null이면
			if (p == root)
				root = p.right;
			else if (isLeftChild)
				parent.left = p.right;
			else
				parent.right = p.right;
		} else if (p.right == null) {
			if (p == root)
				root = p.left;
			else if (isLeftChild)
				parent.left = p.left;
			else
				parent.right = p.left;
		} else {
			parent = p;
			Node<key, value> left = p.left;
			isLeftChild = true;

			while (left.right != null) {
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			p.k = left.k;
			p.v = left.v;
			if (isLeftChild)
				parent.left = left.left;
			else
				parent.right = left.left;
		}
		return true;
	}

	private void printSubTree(Node node) {
		//using recursive
		if (node != null) {
			printSubTree(node.left);
			System.out.println(node.k + " " + node.v);
			printSubTree(node.right);
		}

	}
	public void print() {
		printSubTree(root);
	}

}