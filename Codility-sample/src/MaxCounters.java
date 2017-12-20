/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
 * @score	100%
 */
public class MaxCounters {
	public int[] solution(int N, int[] A) {
		int[] nArr = new int[N];
		int max = 0, lastMax = 0;
		boolean maxTriggered = false;

		for (int i = 0; i < A.length; i++) {
			if (A[i] <= N) {
				if (maxTriggered && nArr[A[i] - 1] < lastMax)
					nArr[A[i] - 1] = lastMax + 1;
				else
					nArr[A[i] - 1]++;
				if (max < nArr[A[i] - 1])
					max = nArr[A[i] - 1];
			} else {
				maxTriggered = true;
				lastMax = max;
			}
		}
		for (int i = 0; i < nArr.length && maxTriggered; i++) {
			if (nArr[i] < lastMax)
				nArr[i] = lastMax;
		}

		return nArr;
	}
}
