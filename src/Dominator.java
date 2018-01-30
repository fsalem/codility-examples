import java.util.Stack;

/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/8-leader/dominator/
 * @score	100%
 */

public class Dominator {
	public int solution(int[] A){
		Stack<Integer> stack = new Stack<>();
		for (int i=0 ; i<A.length ; i++){
			if (stack.isEmpty() || stack.peek() == A[i]){
				stack.push(A[i]);
			}else{
				stack.pop();
			}
		}
		int index = -1;
		int count = 0;
		for (int i=0 ; i<A.length && !stack.isEmpty() ; i++)
			if (A[i] == stack.peek()){
				count++;
				index = i;
			}
		
		return count > A.length/2 ? index : -1;
	}
}
