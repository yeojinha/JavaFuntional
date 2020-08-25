package Java_Algo_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaSorting{
	public static class nameComparator implements Comparator<Fruit> {
		@Override
		public int compare(Fruit f1,Fruit f2) {
			return f1.name.compareTo(f2.name);
		}
	}
	public static class priceComparator implements Comparator<Fruit> {
		@Override
		public int compare(Fruit f1,Fruit f2) {
			return f1.price-f2.price;
		}
	}
	public static class Fruit implements Comparable<Fruit>{// 한 가지만 비교하려면..
		String name;
		int price;
		Fruit(String name, int price){
			this.name=name;
			this.price=price;
		}
		public int compareTo(Fruit other) {
			return this.price>other.price? 1:this.price==other.price? 0:-1;
		}
		public String toString() {
			return this.name+" "+this.price;
		}
		
	}
	
	//두 가지를 비교하려면 Comparator을 이용
	
	public static void main(String[] args) {
		List<Fruit> list=new ArrayList<>();	
		list.add(new Fruit("apple",300));
		list.add(new Fruit("banana",200));
		list.add(new Fruit("peach",500));
		list.add(new Fruit("melon",700));
		list.add(new Fruit("mikang",600));
		
		for(Fruit f:list) {
			System.out.print(f.toString()+" ");
		}
		
		System.out.println("\n");
		Collections.sort(list,new priceComparator());
		System.out.println("Ordered by price");
		for(Fruit f:list) {
			System.out.print(f.toString()+" ");
		}
		Collections.sort(list,new nameComparator());		
		System.out.println("\n");
		System.out.println("Ordered by name");
		for(Fruit f:list) {
			System.out.print(f.toString()+" ");
		}
		
		
		
		
	}

}
