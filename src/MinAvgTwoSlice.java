/**
 * You need to read this proof in advance to understand the solution. THIS IS NOT TRIVIAL AT ALL
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
 * @score	100%	
 *
 */
public class MinAvgTwoSlice {
	public int solution(int[] A){
		int indx=0;
		double avg = 0;
		for (int i=0 ; i<A.length ; i++){
			avg+=A[i];
		}
		avg /= A.length;
		double tmp;
		for (int i=0 ; i<A.length-1 ; i++){
			tmp= (A[i]+A[i+1])/2.0;
			if (tmp < avg){
				avg = tmp;
				indx = i;
			}
			if (i < A.length - 2){
				tmp= (A[i]+A[i+1]+A[i+2])/3.0;
				if (tmp < avg){
					avg = tmp;
					indx = i;
				}
			}
		}
		return indx;
	}
}
