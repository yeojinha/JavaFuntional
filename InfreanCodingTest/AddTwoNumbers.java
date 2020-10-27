package InfreanCodingTest;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val=x;
	}
}
public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(2);
		
		ListNode node=solve(l1,l2);
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
		System.out.println();
		ListNode node_1=solution(l1,l2);
		while(node_1!=null) {
			System.out.print(node_1.val+" ");
			node_1=node_1.next;
		}
	}
	public static ListNode solution(ListNode l1,ListNode l2) {
		//1
		ListNode newHead=new ListNode(0);
		ListNode p1=l1, p2=l2, p3=newHead;
		int carry=0;
		
		while(p1!=null ||p2!=null) {
			
			carry+=p1.val;
			carry+=p2.val;
		
			p3.next=new ListNode(carry%10);//나
			carry/=10;//carry발생하면 1이 될 것이고 41,42행의 값이 더 해지고 , 10으로 나눈 나머지가 next에 들어감
			p3=p3.next;
			p1=p1.next;
			p2=p2.next;
		
		}	
		if(carry>=1) {
			p3.next=new ListNode(carry);
		}
		return newHead.next;//next를 반환하는 이유는 newHead는 0
	}
	public static ListNode solve(ListNode l1,ListNode l2) {
		//1
		ListNode newHead=new ListNode(0);
		ListNode p1=l1, p2=l2, p3=newHead;
		int carry=0;
		//2
		while(p1!=null||p2!=null) {
			if(p1!=null) {
				carry+=p1.val;
				p1=p1.next;
			}
			if(p2!=null) {
				carry+=p2.val;
				p2=p2.next;
			}
			p3.next=new ListNode(carry%10);
			p3=p3.next;
			carry/=10;
		}
		if(carry==1) p3.next=new ListNode(1);
		return newHead.next;
	}
}
