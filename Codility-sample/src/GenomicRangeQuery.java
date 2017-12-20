/**
 * 
 * @author  Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
 * @score	100%
 */
public class GenomicRangeQuery {
	public int[] solution(String S, int[] P, int[] Q) {
		int[][] count = new int[3][S.length() + 1];
		int A,C,G;
		for (int i = 0; i < S.length(); i++) {
			A=C=G=0;
			switch (S.charAt(i)) {
			case 'A':
				A=1;
				break;
			case 'C':
				C=1;
				break;
			case 'G':
				G=1;
				break;
			}
			count[0][i + 1] = count[0][i] + A;
			count[1][i + 1] = count[1][i] + C;
			count[2][i + 1] = count[2][i] + G;
		}
		int[] res = new int[P.length];
		for (int i = 0; i < P.length; i++) {
			if (count[0][Q[i]+1] - count[0][P[i]] > 0)
				res[i] = 1;
			else if (count[1][Q[i]+1] - count[1][P[i]] > 0)
				res[i] = 2;
			else if (count[2][Q[i]+1] - count[2][P[i]] > 0)
				res[i] = 3;
			else
				res[i] = 4;
		}
		return res;
	}
}
