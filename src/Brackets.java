/**
 * 
 * @author 	Farouk Salem
 * @URL		https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
 * @score	100%
 */

import java.util.ArrayList;
import java.util.Stack;

public class Brackets {

	public int solution(String S) {
		int nested = 1;
		Stack<Character> stack = new Stack<>();
		ArrayList<Character> openProperty = new ArrayList<>(), closeProperty = new ArrayList<>();
		openProperty.add('{');
		closeProperty.add('}');
		openProperty.add('(');
		closeProperty.add(')');
		openProperty.add('[');
		closeProperty.add(']');
		for (int i = 0; i < S.length(); i++) {
			if (openProperty.contains(S.charAt(i))) {
				stack.push(S.charAt(i));
			}
			if (closeProperty.contains(S.charAt(i))) {
				if (stack.isEmpty() || openProperty.indexOf(stack.pop()) != closeProperty.indexOf(S.charAt(i))) {
					nested = 0;
					break;
				}
			}
		}
		return stack.isEmpty()?nested:0;
	}
}
