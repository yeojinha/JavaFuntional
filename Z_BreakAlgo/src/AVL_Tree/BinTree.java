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
	private Comparator<? super key> comparator = null;// ����

	public BinTree() {
		root = null;
	}

	public BinTree(Comparator<? super key> c) {
		this();// defualt �����ڸ� ����
		comparator = c;// comparator�� c�� ����
	}

	private int comp(key k1, key k2) {
		return (comparator == null) ? ((Comparable<key>) k1).compareTo(k2)// k1�� Comparable �������̽��� ����ȯ
				: comparator.compare(k1, k2);
	}

	public value search(key k) {

		// recursive�� �̿�

		Node<key, value> p = root;

		while (true) {
			if (p == null)
				return null;
			int cont = comp(k, p.getKey());// ���� ����Ͽ� �� ����
			if (cont == 0)
				return p.getValue();// ���� ��� �ش��ϴ� value�� ��ȯ
			else if (cont < 0)
				p = p.left;// left�� �̵���.
			else
				p = p.right;// �ƴϸ� right�� �̵���.
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
		Node<key, value> p = root;// root�� ����
		Node<key, value> parent = null;
		boolean isLeftChild = true;

		while (true) {// �����ϰ��� �ϴ� key�� �߰��� �� ���� loop
			if (p == null) {// root�� null�� ���
				return false;
			}
			int cond = comp(k, p.getKey());// �Է��� k�� p�� k ��

			if (cond == 0)
				break;// ������ break;
			else {
				parent = p;// root�� ����
				if (cond < 0) {// �����̸�
					isLeftChild = true;
					p = p.left;// p�� �������� �ٲ�
				} else {
					isLeftChild = false;
					p = p.right;
				}
			}
		}

		if (p.left == null) {// ������ null�̸�
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