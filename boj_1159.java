
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class boj_1159 {

	public static void main(String[] args) throws IOException {
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(bf.readLine());
			//StringBuilder org=new StringBuilder();
			//List<String> list=new ArrayList<>();
			Map<Character,Integer> map=new HashMap<>();
			for(int i=0;i<n;i++) {
				char firstName=bf.readLine().charAt(0);
				//map.put(firstName, map.containsKey(firstName) ? map.get(firstName) + 1 : 1);
				if(map.containsKey(firstName))
					map.put(firstName, map.get(firstName)+1);
				else
					map.put(firstName, 1);
			}
			
			if(map.keySet().stream()//key�� �� ������ listó��
			.filter(name->map.get(name)>=5)//������ key�� value ����.
			.count()<=0) System.out.println("PREDAJA");//5�� �Ѵ°� 0 ���ϸ�
			else
				map.keySet().stream()//key�� �� ������ listó��
				.filter(name->map.get(name)>=5)//5 �̻��� ����
				.forEach(name -> System.out.print(name));//�� ��½�Ŵ
	}
}
