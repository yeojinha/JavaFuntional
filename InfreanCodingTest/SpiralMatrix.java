package InfreanCodingTest;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
//2차원 배열을 회전하는 형태로 출력함
	public static void main(String[] args) {
		int[][]arr= { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(solution(arr));
		
	}
	public static List<Integer> solution(int [][]arr) {
		List<Integer> list=new ArrayList<>();
		if(arr ==null || arr.length==0)
			return list;
		
		int row=0;
		int rowEnd=arr.length-1;
		int colEnd=arr[0].length-1;
		int col=0;
	
		while(col<=colEnd && row <=rowEnd) {
			
			
			for(int i=col;i<=colEnd;i++ ) {
				list.add(arr[row][i]);//01020304
			}
			row++;//1
			for(int i=row;i<=rowEnd;i++) {
				list.add(arr[i][colEnd]);//11 12 13 14
			}
			colEnd--;
			if(row<=rowEnd)
			for(int i=colEnd;i>=col;i--) {
				list.add(arr[rowEnd][i]);
			}
			rowEnd--;
			if(col<=colEnd)
				if(row<=rowEnd)
			for(int i=rowEnd;i>=row;i--) {
				list.add(arr[rowEnd][col]);
			}
			col++;
			
		}
		return list;
	}
	

}
