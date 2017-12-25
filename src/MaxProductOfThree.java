import java.util.Arrays;

/**
 * 
 */

/**
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
 * @score	100%
 *
 */
public class MaxProductOfThree {
	public int solution(int[] A){
		Arrays.sort(A);
		int max = A[0] < 0 && A[1] < 0? A[0] * A[1] * A[A.length-1]:Integer.MIN_VALUE;
		
		for (int i=0 ; i<A.length-2 ; i++){
			if (A[i]*A[i+1]*A[i+2] > max)
				max = A[i]*A[i+1]*A[i+2];
		}
		return max;
	}
	
}
