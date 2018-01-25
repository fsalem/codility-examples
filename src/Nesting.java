/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/
 * @score	100%
 */
public class Nesting {
	public int solution(String S){
		int count = 0;
		for (int i =0 ; i<S.length() ; i++){
			if (S.charAt(i) == '(')count++;
			if (S.charAt(i) == ')' && count <= 0)return 0;
			if (S.charAt(i) == ')' && count > 0)count--;
		}
		return count == 0 ? 1 : 0;
	}
}
