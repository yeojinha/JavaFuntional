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
		
		
		
		List<String>readOnly=Collections.unmodifiableList(list);//immutableList�� 
		for(String i:readOnly) {
			System.out.print(i+" ");
		}
		System.out.println(readOnly);
		//readOnly.add("GH"); list ��ü�� immutable�̱⿡ �߰��� �Ұ����ϴ�.

		//List<String> java9List=List.of("ab","cd","ef"); java9������ ����, immutable�� ��ȯ
		
		List<String> java8List=Arrays.asList("ab","cd","ef");//mutable ��ȯ
		
		
	}

}
