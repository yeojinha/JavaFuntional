package BubbleSort;

public class main {

	public static void main(String[] args) {
		list a=new list();
		int [] arr = {5,6,4,2,15,1,8,88,3,12};
		for(int i=arr.length-1; i>=0;i--)
		{
			a.addFirst(arr[i]);
		}
		a.show();
	    a.BubbleSort();
	    a.show();
	    a.addFirst(99);
	    a.show();
	    a.BubbleSort();
	    a.show();
	    a.remove(10);
	    a.add(100, 9);
	    a.show();
	    a.BubbleSort();
	    a.show();
	    
	}

}
