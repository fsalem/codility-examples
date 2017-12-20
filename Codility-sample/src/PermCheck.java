
public class PermCheck {

	public int solution(int[] A) {
        boolean[] exist = new boolean[A.length+1];
        for (int i=0 ; i<A.length ; i++)
        	if (A[i] <= A.length)exist[A[i]]=true;
        for (int i=1 ; i<A.length+1 ; i++)
        	if (!exist[i])return 0;
        return 1;
    }
}
