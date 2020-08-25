package Dequeue;

public class main {

	public static void main(String[] args) {
		Dequeue deq=new Dequeue<Integer>();
		deq.addFront(1);
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		deq.addFront(2);
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		deq.addFront(3);
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		deq.addRear(5);
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		deq.addRear(6);
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		deq.addRear(7);
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		deq.addRear(8);
		System.out.println("-----------------");
		deq.addRear(9);
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		deq.addRear(10);
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		deq.addRear(11);
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		System.out.printf("DeleteFront: %d\n",deq.DeleteFront());
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		System.out.printf("DeleteRere: %d\n",deq.Deleterear());
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		System.out.printf("DeleteRere: %d\n",deq.Deleterear());
		System.out.println("-----------------");
		deq.show();
		System.out.println("-----------------");
		System.out.printf("size of dec: %d\n",deq.getSize());
		int length=deq.getSize();
		for(int i=0;i<length;i++)
		{
			System.out.printf("DeleteFront: %d\n",deq.DeleteFront());
		}
		//
		//System.out.printf("DeleteFront: %d\n",deq.DeleteFront());
		//System.out.printf("DeleteRere: %d\n",deq.Deleterear());
		
	}

}
