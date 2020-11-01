import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_16929 {
	
	//사각형 형태의 줄이 이어져야함.
	//dy,dx는 십자가 모양으로 이동함. 우, 좌, 상, 하
	final static int []dy= {1,-1,0,0};
	final static int []dx= {0,0,1,-1};
	static boolean [][]map_visited;
	static char [][]map;
	static Integer nx,ny;
	//우,좌,상,하
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk=new StringTokenizer(br.readLine()," ");
		ny=Integer.valueOf(stk.nextToken());
		nx=Integer.valueOf(stk.nextToken());
		
		map=new char[ny][nx]; 
		map_visited=new boolean[ny][nx];//for visited check
		
		boolean result=false;
		
		for(int i=0;i<ny;i++) {
				map[i]=br.readLine().toCharArray();//str -> charArray
		}
		/*
		System.out.println();
		for(int i=0;i<ny;i++) {
			for(int j=0;j<nx;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}*/
		
		
		
		//1 2중 for문으로 계쏙 돌아야함.
		for(int i=0;i<ny;i++)
		{
			for(int j=0;j<nx;j++)
			{
				if(!map_visited[i][j]) {
					result=dfs(i,j,-1,-1,map[i][j]);
					if(result) {
						System.out.println("Yes");
						System.exit(0);
					}
				}
			}	
		}
		System.out.println("No");

	}
	public static boolean dfs(int y,int x,int cnt_y,int cnt_x,char alpha) {
		if(map_visited[y][x]) {
			return true;
		}
		map_visited[y][x]=true;
		
		for(int i=0;i<4;i++) {
			int dy_y=y+dy[i];
			int dx_x=x+dx[i];
			if(!(dy_y>=0 && ny>dy_y &&  dx_x>=0 && nx>dx_x)) continue;//idx범위 안에 있어야 한다.
			if(alpha!=map[dy_y][dx_x]) continue;//이동한 자리가 다른 알파벳이면 연결이 될 수 없다.
			if(dy_y==cnt_y && dx_x==cnt_x) continue;//cnt_y와 cny_x를 만나면 이미 true를 방문한 격이니 continue를 해주자.
			/*dy[],dy[]에 의해, 방문했던 곳을 다시 방문하게 된다.
			 * 이렇게 되면, dfs는 true를 다시 발견한 것이므로 true를 반환할 것이다.
			 * 그렇기에, 과거 방문한 곳이면 continue해주어  if(dfs(dy_y,dx_x,y,x,alpha))행을 무시해준다.
			 */
			if(dfs(dy_y,dx_x,y,x,alpha))
				return true;
		}
		return false;
	}

}
