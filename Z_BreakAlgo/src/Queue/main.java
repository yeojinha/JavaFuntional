package Queue;

public class main {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.Enqeue(1);
		q.Enqeue(2);
		q.Enqeue(3);
		q.Enqeue(4);
		
		System.out.println("-----------------");
		System.out.println("isEmpty: "+q.isEmpty());
		System.out.println("-----------------");
		
		
		int size=q.getSize();
		for(int i=0;i<size;i++)
			System.out.println(q.Deqeue());
		System.out.println("-----------------");
		
		
		System.out.println("isEmpty: "+q.isEmpty());
		

		
		
	}

}
