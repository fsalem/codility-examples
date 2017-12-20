
public class MissingInteger {

	public int solution(int[] A) {
		boolean[] vis = new boolean[1000001];
		for (int i=0 ; i< vis.length ; i++)vis[i]=false;
		
		for (int i=0 ; i< A.length ; i++){
			if (A[i] > 0 && !vis[A[i]-1]) vis[A[i]-1] = true;
		}
		
		int i=0;
		while (vis[i]){i++;}
		return i+1;
	}
}
