/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
 * @score	100%
 */
public class CountDiv {

	public int solution(int A, int B, int K){
		if (K > B && A > 0)return 0;
		if ((K > B && A >= 0) || (K >= B && A > 0))return 1;
		if (K >= B && A >= 0)return 2;
		A = A== 0 || A>=K ? A : K;
		if (A%K != 0)
			A = A + (K-(A%K));
		B = B-(B%K);
		//System.out.println(A+" , "+B + ", "+((B/K)-(A/K)));
		return (B/K)-(A/K)+1;
	}
}
