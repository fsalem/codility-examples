
public class FrogRiverOne {

	public int solution(int X, int[] A) {
		boolean[] found = new boolean[X+1];
		found[0] = true;
		int count = 0;
		for (int i=0 ; i<A.length ; i++){
			if (A[i] <= X && !found[A[i]]){
				found[A[i]]=true;
				if (count + 1 == A[i]){
					for (int j=A[i] ; j < X+1 && found[j] ; j++)
						count++;
				}
				if (count == X)return i;
			}
		}
		return -1;
	}
}
