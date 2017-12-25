import java.util.Arrays;

/**
 * 
 */

/**
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/6-sorting/distinct/
 * @score	100%
 *
 */
public class Distinct {

	public int solution(int[] A){
		if (A.length == 0) return 0;
		int count = 1;
		Arrays.sort(A);
		for (int i=1 ; i<A.length ; i++){
			if (A[i] > A[i-1])count++;
		}
		return count;
	}
}
