package Java_8_91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Immutable {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("AB");
		list.add("CD");
		list.add("EF");
		System.out.println(list);
		
		
		
		List<String>readOnly=Collections.unmodifiableList(list);//immutableList로 
		for(String i:readOnly) {
			System.out.print(i+" ");
		}
		System.out.println(readOnly);
		//readOnly.add("GH"); list 자체가 immutable이기에 추가가 불가능하다.

		//List<String> java9List=List.of("ab","cd","ef"); java9에서만 가능, immutable을 반환
		
		List<String> java8List=Arrays.asList("ab","cd","ef");//mutable 반환
		
		
	}

}
