/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_double_slice_sum/
 * @score	100%
 */

public class MaxDoubleSliceSum {
	public int solution(int[] A){
		int[] down_sum = new int[A.length];
		int[] up_sum = new int[A.length];
		
		for (int i=1 ; i<A.length ; i++) down_sum[i]=Math.max(0, down_sum[i-1]+A[i]);
		for (int i=A.length-2 ; i>=0 ; i--) up_sum[i]=Math.max(0, up_sum[i+1]+A[i]);
		
		int max = 0;
		for (int i=1 ; i<A.length-1 ; i++)max = Math.max(max, down_sum[i-1]+up_sum[i+1]);
		
		return max;
	}
}
