package InfreanCodingTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode_1{
	ListNode_1 next;
	int val;
	ListNode_1(int val){
		this.val=val;
	}
	ListNode_1(){
	}
	ListNode_1(int val,ListNode_1 next){
		this.val=val;
		this.next=next;
	}
}

public class MergeKsorterLists {

	public static void main(String[] args) {
		ListNode_1 l1=new ListNode_1(1);
		l1.next=new ListNode_1(4);
		l1.next.next=new ListNode_1(5);
		
		ListNode_1 l2=new ListNode_1(1);
		l2.next=new ListNode_1(3);
		l2.next.next=new ListNode_1(4);
		
		ListNode_1 l3=new ListNode_1(2);
		l3.next=new ListNode_1(6);
		
		ListNode_1 []lists=new ListNode_1[3];
		lists[0]=l1;
		lists[1]=l2;
		lists[2]=l3;
		ListNode_1 result=solve(lists);
		for(;result!=null;result=result.next) {
			System.out.print(result.val+" ");
		}
		System.out.println();
		ListNode_1 result_2=solution(l1,l2);
		for(;result_2!=null;result_2=result_2.next) {
			System.out.print(result_2.val+" ");
		}
		
		
	}
	public static ListNode_1 solve(ListNode_1[] lists){//slow
		List<Integer> result= new ArrayList<Integer>();
		ListNode_1 head=new ListNode_1(0);
		for(ListNode_1 node:lists) {
			while(node!=null) {
				result.add(node.val);
				node=node.next;
				
			}
		}
		Collections.sort(result);
		ListNode_1 p=head;
		for(Integer num:result) {
			head.next=new ListNode_1(num);
			head=head.next;
		}
		return p.next;
	}
	public static ListNode_1 solution(ListNode_1 l1,ListNode_1 l2) {//fast
		ListNode_1 result=new ListNode_1(0);
		ListNode_1 p=result;
		
		if(l1 ==null) {
			return l1;
		}else if(l2==null) {
			return l2;
		}
		ListNode_1 p1=l1,p2=l2;
		
		while(p1!=null && p2!=null) {
			if(p1.val<p2.val) {
				p.next=p1;
				p1=p1.next;
			}else {
				p.next=p2;
				p2=p2.next;
			}
			
			p=p.next;
		}
			if(p1!=null){
			    p.next = p1;
		    }
		    if(p2!=null){
		        p.next = p2;
		    }
		return result.next;
	}
}
