package Java_8_91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("abc","defg","hader","dfearf");
		int count=0;
		//���� for���̿�
		for(String w: list) {
			if(w.length()>3) {
				count++;
			}
		}//
		System.out.println("count: "+count);
		int count_stream=(int) list.stream()
				.filter(w->w.length()>3)
				.count();

		System.out.println("count_stream: "+count_stream);
		int count_paralleCount=(int)list.parallelStream()
				.filter(w->w.length()>3)
				.count();
		System.out.println("count_stream_parallel: "+count_paralleCount);
		
	//���ο� list�� ��ȯ �ޱ�.
		List<String> listOfNew=list.stream()
				.filter(w->w.length()>4)
				.limit(2)
				.collect(Collectors.toList());
		
		System.out.println(listOfNew);
		
		List<member> memberList=Arrays.asList(new member(10,"ha")
				,new member(15,"kim"),new member(20,"su"),new member(20,"so")
				,new member(20,"song"),new member(20,"syo"));
		
		
		int TotalAge=memberList.stream()
				.map(member::getAge)//member Ŭ������ getAge�� �ҷ���.
				.reduce(0,(pre,cur)->pre+cur);//reduce 0�� start����Ʈ
		
		System.out.println("TotalAge: "+TotalAge);
		

		int TotalAgeFilterLimit=memberList.stream()
				.map(member::getAge)//member Ŭ������ getAge�� �ҷ���.
				.filter(age->age>=20)// 20�̻�
				.limit(2)//2���� 
				.reduce(0,(pre,cur)->pre+cur);
		System.out.println("TotalAgeFilterLimit: "+TotalAgeFilterLimit);
	}
	static class member{
		String name;
		int age;
		member(int age, String name){
			this.age=age;
			this.name=name;
		}
		int getAge() {
			return this.age;
		}
	}

}
