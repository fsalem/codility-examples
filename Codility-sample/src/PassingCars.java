
public class PassingCars {

	public int solution(int[] A) {
        int ones = 0, pairs = 0;
        for (int n:A){
        	if (n == 1)ones++;
        }
        
        int cur_ones=0;
        for (int n:A){
        	if (n == 1) cur_ones++;
        	else {
        		pairs += (ones - cur_ones);
        		if (pairs > 1000000000)
                	return -1;
        	}
        }
        
        return pairs;
    }
}
