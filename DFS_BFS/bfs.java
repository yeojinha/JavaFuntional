package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bfs {

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

		bfs(n,visited,graph);
	}
	public static void bfs(int n,boolean[] visited, ArrayList<Integer> [] graph) {
		
		Queue<Integer> q=new LinkedList<Integer>();	
		q.add(n);
		System.out.print(n+" ");
		while(!q.isEmpty()) {
			int cnt=q.poll();
			visited[cnt]=true;
			for(int node: graph[cnt]) {
				if(!visited[node]) {
					q.add(node);
					System.out.print(node+" ");
				}
			}
		}
		
		
		
	}

}
