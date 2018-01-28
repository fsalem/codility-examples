import java.util.Stack;

/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
 * @score	100%
 */

public class StoneWall {
	public int solution(int[] H){
		Stack<Integer> stack = new Stack<>();
		int stoneCount = 0;
		for (int i=0 ; i<H.length ; i++){
			while (!stack.isEmpty() && H[i] < stack.peek()){
				stack.pop();
			}
			if (stack.isEmpty() || stack.peek() != H[i]){
				stack.push(H[i]);
				stoneCount++;
			}
		}
		return stoneCount;
	}
}
