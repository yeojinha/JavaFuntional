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
			String key = String.valueOf(charArr);//����! ������ �ؾ� ��ġ�ϴ��� �ľ� ����
			if (map.containsKey(key)) {//���� �ϸ� key������ txt ��� �߰�
				map.get(key).add(txt);
			} else {//���� x ���Ӱ� map�� �߰�
				List<String> newList = new ArrayList<>();
				newList.add(key);
				map.put(key, newList);
			}
		}
		result.addAll(map.values());//��� map value�� list�� �߰�
		return result;

	}

}
