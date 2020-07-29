

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj_10866 {
/*
 * push_front X: ���� X�� ���� �տ� �ִ´�.
push_back X: ���� X�� ���� �ڿ� �ִ´�.
pop_front: ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
pop_back: ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
size: ���� ����ִ� ������ ������ ����Ѵ�.
empty: ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
front: ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
back: ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
�Է�
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

