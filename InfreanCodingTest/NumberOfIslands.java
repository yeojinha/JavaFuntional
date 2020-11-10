package InfreanCodingTest;

import java.util.Arrays;

public class NumberOfIslands {
	static int [][] direc= {{0,1},{0,-1},{1,0},{-1,0}};
	static int count=0;
	static boolean [][] visited;
	/*static char [][] temp={
			{'1','0','1','0','1','0'},
			{'1','1','0','1','0','1'},
			{'1','0','0','0','1','1'},
			{'1','0','1','0','1','0'},
			{'1','0','1','0','1','0'}
		   };*/
	public static void main(String[] args) {
		char[][] grid= {
				{'1','0','1','0','1','0'},
				{'1','1','0','1','0','1'},
				{'1','0','0','0','1','1'},
				{'1','0','1','0','1','0'},
				{'1','0','1','0','1','0'}
			   };
		
		visited=new boolean[grid.length][grid[0].length];
		solve(grid);
		System.out.println("count: "+count);
		
		/*for(char[] ch:temp) {
			for(char c: ch) {
				System.out.print(c+" ");
			}
			System.out.println();
		}*/
	}
	static void solve(char [][] grid) {
		if(grid == null|| grid.length==0 || grid[0].length==0) return;
		
		for(int i=0;i<grid[0].length;i++) {
			for(int j=0;j<grid.length;j++) {
				if(!visited[j][i] && grid[j][i]=='1') {
					dfs(grid,j,i);
					count++;
				}
				//temp[j][i]='0';
			}
		}
	}
	static void dfs(char [][]grid,int y,int x) {
		if(y>=grid.length|| x>=grid[0].length || x<0 ||y<0) {
			return;
		}
		//System.out.println("x: "+x+" y: "+y);
		if(grid[y][x]!='1' || visited[y][x])
		{
			return;
		}
		//temp[y][x]='X';
		visited[y][x]=true;
		for(int i=0;i<direc.length;i++) {
			dfs(grid,(y+direc[i][0]),(x+direc[i][1]));
		}
	}
}
