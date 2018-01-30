import java.util.Stack;

/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/8-leader/equi_leader/
 * @score	80%
 */

public class EquiLeader {

	public int solution(int[] A){
		Stack<Integer> nums = new Stack<>();
		boolean []hasTopLeader = new boolean[A.length];
		int []topLeader = new int[A.length];
		for (int i=0 ; i<A.length ; i++){
			if (nums.isEmpty() || nums.peek() == A[i]){
				nums.push(A[i]);
				hasTopLeader[i] = true;
				topLeader[i] = A[i];
			}else{
				nums.pop();
				if (!nums.isEmpty()){
					hasTopLeader[i] = true;
					topLeader[i] = nums.peek();
				}else{
					hasTopLeader[i] = false;
				}
			}
		}
		
		nums.clear();
		boolean []hasDownLeader = new boolean[A.length];
		int []downLeader = new int[A.length];
		for (int i=A.length-1 ; i>=0 ; i--){
			if (nums.isEmpty() || nums.peek() == A[i]){
				nums.push(A[i]);
				hasDownLeader[i] = true;
				downLeader[i] = A[i];
			}else{
				nums.pop();
				if (!nums.isEmpty()){
					hasDownLeader[i] = true;
					downLeader[i] = nums.peek();
				}else{
					hasDownLeader[i] = false;
				}
			}
		}
		
		int count = 0;
		for (int i=0 ;i<A.length-1 ; i++){
			if (hasTopLeader[i] && hasDownLeader[i+1] && topLeader[i] == downLeader[i+1])
				count++;
		}
		return count;
	}
}
