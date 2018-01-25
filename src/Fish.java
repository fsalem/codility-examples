import java.util.Stack;

/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
 * @score	100%
 */
public class Fish {
	public int solution(int[] A, int[] B){
		Stack<Integer> remaining = new Stack<>();
		for (int i =0 ; i<A.length ; i++){
			while (true){
				if (remaining.isEmpty() || B[remaining.peek()] == B[i] || B[remaining.peek()] == 0){
					remaining.push(i);
					break;
				}
				if (A[i] < A[remaining.peek()])break;
				remaining.pop();
			}
		}
		return remaining.size();
	}
}
