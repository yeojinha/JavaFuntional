package TopCoder;

public class main_KiwiJuice {

	public static void main(String[] args) {
		int [] capacities= {14,35,86,58,25,62};
		int []bottels= {6,34,27,38,9,60};
		int [] from= {1,2,4,5,3,3,1,0};
		int [] to= {0,1,2,4,2,5,3,1};
		int [] result=thePouring_enhanced(capacities,bottels,from,to);
		for(int i:result) {
			System.out.print(i+" ");
		}
		//0 14 65 35 25 35
		
	}
	public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int []toId) {
		
		/*
		 * bottles[n]은 n번째 병에 담긴 액체의 양이며,
		 * capacities[n]의 value는 n번째 병에 들어갈 수 있는 양
		 * bollens[0]이 5이고 capacities[0]이 10이라면 
		 * 0번째의 크기 10짜리 병에는 5만큼의 양이 들어가있으며 나머지 5 비어있다.
		 * formId[0]이  0이면 0번째에서 toid[0] 1이면 1번으로 
		 */
		
		for(int i=0;i<fromId.length;i++) {
			
			int from=fromId[i];
			int to=toId[i];
			bottles[to]+=bottles[from];
			
			if(bottles[to]>capacities[to]) {
				bottles[from]=bottles[to]-capacities[to];
				bottles[to]-=bottles[from];

			}else {
				bottles[from]=0;
			}
		}
		return bottles;
	}
	
	
public static int[] thePouring_enhanced(int[] capacities, int[] bottles, int[] fromId, int []toId) {
		
		/*
		 * bottles[n]은 n번째 병에 담긴 액체의 양이며,
		 * capacities[n]의 value는 n번째 병에 들어갈 수 있는 양
		 * bollens[0]이 5이고 capacities[0]이 10이라면 
		 * 0번째의 크기 10짜리 병에는 5만큼의 양이 들어가있으며 나머지 5 비어있다.
		 * formId[0]이  0이면 0번째에서 toid[0] 1이면 1번으로 
		 */
		
		for(int i=0;i<fromId.length;i++) {
			
			int sum=bottles[fromId[i]]+bottles[toId[i]];//from번째의 bottle 양이랑 to번째의 bottle 합침.
			bottles[toId[i]]=Math.min(sum, capacities[toId[i]]);//sum과 to번째의 bottle 용량 중 최소 값 반환
			//이때 sum이 to번째의 용량보다 적으면 bottles to번째는 sum으로 채우기 가능 
			// 만약 sum이 15고 toId 용량이 10이라면 10이 toId번째 bottle로 들어감 ( 꽉 채워진다)
			bottles[fromId[i]]=sum-bottles[toId[i]];
			//sum은 15 toId번째 양을 뺀 것이 fromId bottle에 남은 것
			//sum과 toId용량이 같다면 fromId bottle은 0
			
		}
		return bottles;
	}

}
