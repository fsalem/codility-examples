
public class MinAvgTwoSlice {
	public int solution(int[] A){
		int[] sum = new int[A.length-1];
		sum[A.length-2] = A[A.length-1]+A[A.length-2]; 
		for (int i=A.length-3 ; i>=0 ; i--){
			sum[i] = A[i]+sum[i+1];
		}
		int indx=0;
		int avg = sum[0]/A.length;
		int tmp;
		for (int i=1 ; i<sum.length ; i++){
			tmp = sum[i]/(A.length-i);
			if (tmp < avg){
				avg = tmp;
				indx = i;
			}
		}
		return indx;
	}
}
