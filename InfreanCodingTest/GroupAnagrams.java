package InfreanCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> list = solution(strs);
		System.out.println(list.toString());

	}

	public static List<List<String>> solution(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		if (strs == null || strs.length <= 0)
			return result;
		Map<String, List<String>> map = new HashMap<>();
		for (String txt : strs) {
			char[] charArr = txt.toCharArray();
			Arrays.sort(charArr);
			String key = String.valueOf(charArr);//정렬! 정렬을 해야 일치하는지 파악 가능
			if (map.containsKey(key)) {//존재 하면 key값으로 txt 밸류 추가
				map.get(key).add(txt);
			} else {//존재 x 새롭게 map에 추가
				List<String> newList = new ArrayList<>();
				newList.add(key);
				map.put(key, newList);
			}
		}
		result.addAll(map.values());//모든 map value를 list에 추가
		return result;

	}

}
