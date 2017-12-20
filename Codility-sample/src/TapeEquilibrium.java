
public class TapeEquilibrium {
	public int solution(int[] A) {
		int[] P = new int[A.length];
		P[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			P[i] = P[i - 1] + A[i];
		}

		int min = Math.abs(2 * P[0] - P[P.length - 1]), abs;
		for (int i = 1; i < P.length - 1; i++) {
			abs = Math.abs(2 * P[i] - P[P.length - 1]);
			if (abs < min)
				min = abs;
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] A = {-1000,1000};
		System.out.println(new TapeEquilibrium().solution(A));
	}
}
