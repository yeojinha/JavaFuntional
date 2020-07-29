

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj_10866 {
/*
 * push_front X: 정수 X를 덱의 앞에 넣는다.
push_back X: 정수 X를 덱의 뒤에 넣는다.
pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 덱에 들어있는 정수의 개수를 출력한다.
empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
입력
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Deque<Integer> deq=new LinkedList<>();
		StringBuilder sb=new StringBuilder();
		StringTokenizer stk;
		int num=0;
		for(int i=0;i<n;i++) {
			stk=new StringTokenizer(br.readLine()," ");
			switch(stk.nextToken()) {
			case "push_front":
					num=Integer.parseInt(stk.nextToken());
					deq.addFirst(num);
					break;
			case "push_back":
					num=Integer.parseInt(stk.nextToken());
					deq.addLast(num);
					break;
			case "pop_front":
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else
					sb.append(deq.removeFirst()+"\n");
				break;
			case "pop_back":
				if(deq.isEmpty()) {
					sb.append("-1\n");
				}else
					sb.append(deq.removeLast()+"\n");
				break;
			case "size":
				sb.append(deq.size()+"\n");
				break;
			case "empty":
				if(deq.isEmpty()) {
					sb.append(1+"\n");
				}else sb.append(0+"\n");
				break;
			case "front":
				if(deq.isEmpty())
					sb.append(-1+"\n");
				else
					sb.append(deq.peekFirst()+"\n");
				break;
			case "back":
				if(deq.isEmpty())
					sb.append(-1+"\n");
				else
					sb.append(deq.peekLast()+"\n");
				break;
			
				}
		
					
			}
		System.out.println(sb.toString());
		}
		
	}

