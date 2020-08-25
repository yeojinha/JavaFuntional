import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_12756 {

	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer stk;
	int hp,atk;
	Player [] pys=new Player [2];
	for(int i=0;i<2;i++) {
		stk=new StringTokenizer(br.readLine()," ");
		atk=Integer.parseInt(stk.nextToken());
		hp=Integer.parseInt(stk.nextToken());
		pys[i]=new Player(atk,hp);
	}
	
	while(pys[1].hp>0 && pys[0].hp>0) {
		pys[1].hp-=pys[0].atk;
		pys[0].hp-=pys[1].atk;
		//System.out.println(pys[1].hp);
		//System.out.println(pys[0].hp);
	}
	
	if(pys[1].hp <=0 && pys[0].hp<=0) {
		System.out.println("DRAW");
	}else if(pys[1].hp<pys[0].hp) {
		System.out.println("PLAYER A");
	}else
		System.out.println("PLAYER B");
	
	
	}
	static class Player{
		public int hp;
		public int atk;
		Player(int atk,int hp){
			this.atk=atk;
			this.hp=hp;
		}
	}
}

