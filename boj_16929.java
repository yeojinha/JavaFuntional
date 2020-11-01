import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_16929 {
	
	//�簢�� ������ ���� �̾�������.
	//dy,dx�� ���ڰ� ������� �̵���. ��, ��, ��, ��
	final static int []dy= {1,-1,0,0};
	final static int []dx= {0,0,1,-1};
	static boolean [][]map_visited;
	static char [][]map;
	static Integer nx,ny;
	//��,��,��,��
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
		
		
		
		//1 2�� for������ ��� ���ƾ���.
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
			if(!(dy_y>=0 && ny>dy_y &&  dx_x>=0 && nx>dx_x)) continue;//idx���� �ȿ� �־�� �Ѵ�.
			if(alpha!=map[dy_y][dx_x]) continue;//�̵��� �ڸ��� �ٸ� ���ĺ��̸� ������ �� �� ����.
			if(dy_y==cnt_y && dx_x==cnt_x) continue;//cnt_y�� cny_x�� ������ �̹� true�� �湮�� ���̴� continue�� ������.
			/*dy[],dy[]�� ����, �湮�ߴ� ���� �ٽ� �湮�ϰ� �ȴ�.
			 * �̷��� �Ǹ�, dfs�� true�� �ٽ� �߰��� ���̹Ƿ� true�� ��ȯ�� ���̴�.
			 * �׷��⿡, ���� �湮�� ���̸� continue���־�  if(dfs(dy_y,dx_x,y,x,alpha))���� �������ش�.
			 */
			if(dfs(dy_y,dx_x,y,x,alpha))
				return true;
		}
		return false;
	}

}
