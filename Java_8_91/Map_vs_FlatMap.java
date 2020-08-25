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
		// map�� �̿��� set���� �׸��� forEach�� ���.

		System.out.println("-------------------------");
		/*
		 * // ����Ʈ ���� List<Person> personList = Arrays.asList(new Person("Kimtaeng", 30),
		 * new Person("Madplay", 29));
		 * 
		 * // �ʱ� ���� personList.stream().map(new Function<Person, String>() {
		 * 
		 * @Override public String apply(Person person) { return person.getName(); }
		 * }).collect(Collectors.toSet());
		 * 
		 * // ���ٽ� ���� personList.stream().map(person -> person.getName())
		 * .collect(Collectors.toSet());
		 * 
		 * // �޼��� ���� ���� personList.stream().map(Person::getName)
		 * .collect(Collectors.toSet());
		 */

		// flatMap
		String[][] namesArray = new String[][] { { "kim", "taeng" }, { "mad", "play" }, { "kim", "mad" },
				{ "taeng", "play" } };
				
			Set<String> namesFlatMap=Arrays.stream(namesArray)//[i][k] i�κ��� namesArray�̰�  
					.flatMap(innerArray->Arrays.stream(innerArray))//innerArray�� k�κ��̴�.
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
