package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class dfs {
	/*
	 * 4 5 1
1 2
1 3
1 4
2 4
3 4
	 */
/*
 *
6
6
0
0 1
0 2
1 3
2 4
2 5
4 6
 */
	/*0
	 *결과
dfs_recursive: 0 1 3 2 4 6 5 
dfs_matrix: 0 1 3 2 4 6 5 
dfs_stack_list: 0 2 5 4 6 1 3 
dfs_stack_matrix: 0 2 5 4 6 1 3 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int v=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());//탐색 
		
		ArrayList[] graph=new ArrayList[v+1];
		int [][]adjMatrix=new int[v+1][v+1];
		boolean []visited=new boolean[v+1];
		
		for(int i=0;i<v+1;i++) {
			graph[i]=new ArrayList<Integer>();//초기화
		}
		StringTokenizer stk;
		for(int i=0;i<m;i++) {//쌍연결
			stk=new StringTokenizer(br.readLine()," ");
			int x=Integer.parseInt(stk.nextToken());
			int y=Integer.parseInt(stk.nextToken());
			adjMatrix[y][x]=adjMatrix[x][y]=1;//인접행렬
			graph[x].add(y);
			graph[y].add(x);
		}
		for(int i=0;i<graph.length;i++)
			Collections.sort(graph[i]);
		System.out.print("dfs_recursive: ");
		dfs_recursive(n,visited,graph);
		System.out.println();
		Arrays.fill(visited, false);
		
		System.out.print("dfs_matrix: ");
		dfs_matrix(n,visited,adjMatrix);
		System.out.println();
		Arrays.fill(visited, false);
		
		System.out.print("dfs_stack_list: ");
		dfs_stack_list(n, visited, graph);
		System.out.println();
		Arrays.fill(visited, false);
		
		System.out.print("dfs_stack_matrix: ");
		dfs_stack_matrix(n,visited,adjMatrix);
		System.out.println();
		Arrays.fill(visited, false);
		

	}
	public static void dfs_recursive(int n,boolean []visited,ArrayList<Integer>[]graph) {
		visited[n]=true;
		System.out.print(n+" ");
		for(int node:graph[n]) {
			if(!visited[node])
				dfs_recursive(node,visited,graph);
		}
		
	}
	public static void dfs_matrix(int n,boolean []visited,int[][]arr) {
		visited[n]=true;
		System.out.print(n+" ");	
		for(int i=0;i<arr.length;i++) {
			if(arr[n][i]==1 && !visited[i]) {
				dfs_matrix(i,visited,arr);
			}
		}
	}
	public static void dfs_stack_list(int n, boolean[]visited,ArrayList<Integer>[]arr) {
		Stack<Integer> stack=new Stack<>();
		stack.push(n);
		System.out.print(n+" ");
		while(!stack.isEmpty()) {
			int current=stack.peek();
			visited[current]=true;
			boolean flag=false;
			for(int node:arr[current]) {
				if(!visited[node]) {
					stack.push(node);
					flag=true;
					System.out.print(node+" ");
					break;
				}
			}
			if(flag==false) stack.pop();
		}
	}
	public static void dfs_stack_matrix(int n, boolean []visited,int [][]arr) {
		Stack<Integer> stack=new Stack<>();
		stack.push(n);
		System.out.print(n+" ");
		while(!stack.isEmpty()) {
			int current=stack.peek();
			boolean flag=false;
			for(int i=1;i<arr.length;i++) {
				if(arr[current][i]==1&&visited[i]!=true) {
					stack.push(i);
					visited[i]=true;
					System.out.print(i+" ");
					flag=true;
					break;
				}
			}
			if(flag==false) {
				stack.pop();
			}
		}
	}
}
