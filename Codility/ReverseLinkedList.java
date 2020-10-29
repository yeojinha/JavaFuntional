package Codility;

class LinkedList{
	node head=null;
	
	void addNode(int val) {
		node newNode=new node(val);
		if(head==null) {
			head=newNode;
		}else {
			node p=head;
			while(p.link!=null) {
				p=p.link;
			}
			p.link=newNode;
		}
		//System.out.println(newNode.data);
	}
	void printNode() {
		node p=head;
		while(p!=null) {
			System.out.print(p.data+" ");
			p=p.link;
		}
	}
}
class node<Integer>{
	node link;
	int data;
	node(int data){
		this.data=data;
		this.link=null;
	}
}
public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.printNode();// 1 2 3 
		LinkedList result=solution(list);
		System.out.println();
		result.printNode();// 3 2 1
		System.out.println();
		list.printNode();// 1 2 3
		System.out.println();
		result.printNode();
		
	}
	public static LinkedList solution(LinkedList list){
		//if want to return new list;
		node p=list.head;
		LinkedList result=new LinkedList();
		while(p!=null) {
			result.addNode(p.data);
			p=p.link;
		}//copied list
		
		node current=result.head;
		node next=null,prev=null;
		while(current!=null) {
			next=current.link;
			current.link=prev;
			prev=current;
			current=next;
		}
		result.head=prev;
		return result;
	}
}
