package Java_8_91;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Map_vs_FlatMap {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Kimtaeng", 30), new Person("Madplay", 29));
		// Map Test

		Set<String> names = personList.stream().map(Person::getName).collect(Collectors.toSet());
		names.forEach(System.out::println);
		// map을 이용한 set주입 그리고 forEach로 출력.

		System.out.println("-------------------------");
		/*
		 * // 리스트 생성 List<Person> personList = Arrays.asList(new Person("Kimtaeng", 30),
		 * new Person("Madplay", 29));
		 * 
		 * // 초기 형태 personList.stream().map(new Function<Person, String>() {
		 * 
		 * @Override public String apply(Person person) { return person.getName(); }
		 * }).collect(Collectors.toSet());
		 * 
		 * // 람다식 적용 personList.stream().map(person -> person.getName())
		 * .collect(Collectors.toSet());
		 * 
		 * // 메서드 참조 적용 personList.stream().map(Person::getName)
		 * .collect(Collectors.toSet());
		 */

		// flatMap
		String[][] namesArray = new String[][] { { "kim", "taeng" }, { "mad", "play" }, { "kim", "mad" },
				{ "taeng", "play" } };
				
			Set<String> namesFlatMap=Arrays.stream(namesArray)//[i][k] i부분이 namesArray이고  
					.flatMap(innerArray->Arrays.stream(innerArray))//innerArray는 k부분이다.
					.filter(name->name.length()>3)
					.collect(Collectors.toSet());
			
			namesFlatMap.forEach(System.out::println);
	}

	static class Person {
		private String name;
		private Integer age;

		Person(String name, int age) {
			this.age = age;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

	}

}
