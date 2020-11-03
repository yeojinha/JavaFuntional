package InfreanCodingTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNode{
	int  val;
	TreeNode left, right;
	TreeNode(int x){
		this.val=x;
	}
}
public class BynaryTreeLevelOrder {

	public static void main(String[] args) {
			TreeNode root=new TreeNode(3);
			root.left=new TreeNode(4);
			root.right=new TreeNode(5);
			root.left.left=new TreeNode(6);
			root.left.right=new TreeNode(7);
			System.out.println(solve(root).toString());
			//System.out.println(solve_2(root).toString());
	}
	/*public static List<List<Integer>> solve_2(TreeNode root){
		List<List<Integer>> result=new ArrayList<>();
		if(root==null) {
			return result;
		}
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			int size=stack.size();
			List<Integer> list=new LinkedList<>();
			for(int i=0;i<size;i++) {
				TreeNode node=stack.pop();
				if(node.right!=null) stack.push(node.right);
				if(node.left!=null) stack.push(node.left);
				list.add(node.val);
			}
			result.add(list);
		}
		return result;
	}*///bfs -> queue dfs -> stack
	public static List<List<Integer>> solve(TreeNode root) {
		List<List<Integer>> result=new ArrayList<>();
		if(root==null) {
			return result;
		}
		Queue<TreeNode> quque=new LinkedList<>();
		quque.offer(root);
		//System.out.println("size of quque"+quque.size());
		while(!quque.isEmpty()) {
			int size=quque.size();
			List<Integer> list=new LinkedList<>();
			for(int i=0;i<size;i++) {
				TreeNode node=quque.poll();
				list.add(node.val);
				if(node.left!=null)
					quque.offer(node.left);
				if(node.right!=null)
					quque.offer(node.right);
			}
			result.add(list);
		}
		return result;
	}

}
