/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
 * @score	100%
 */
public class MaxProfit {

	public int solution(int[] A){
		if (A.length <= 1)return 0;
		int minPrice = A[0],
			maxProfit = 0;
		for (int i=1 ; i<A.length ; i++){
			maxProfit = Math.max(maxProfit, A[i]-minPrice);
			minPrice = Math.min(minPrice, A[i]);
		}
		return maxProfit;
	}
}
