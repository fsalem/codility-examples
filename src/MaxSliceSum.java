/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/
 * @score	100%
 */
public class MaxSliceSum {
	public int solution(int[] A){
		
		int[] max = new int [A.length];
		int generalMax = A[0];
		max[0] = A[0];
		
		for (int i=1 ;i <A.length ; i++){
			max[i] = Math.max(A[i], A[i]+max[i-1]);
			generalMax = Math.max(max[i], generalMax);
		}
		
		return generalMax;
	}
}
