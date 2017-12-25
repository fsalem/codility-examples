import java.util.Arrays;

/**
 * 
 */

/**
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/6-sorting/triangle/
 * @score	100%
 *
 */
public class Triangle {

	public int solution(int[] A){
		if (A.length < 3)return 0;
		Arrays.sort(A);
		for (int i=0 ; i<A.length-2 ; i++){
			// equation is converted to minus because it failed with 3 MAXINTs (overflow!)
			if (A[i] >= 0 && A[i] > A[i+2] - A[i+1] )return 1;
		}
		return 0;
	}
}
