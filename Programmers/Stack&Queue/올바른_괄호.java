import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Deque<Character> stack = new ArrayDeque<>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='(') stack.offerLast('(');
            else {
                if (stack.isEmpty()) {
                    answer = false;
                    return answer;
                } else {
                    stack.pollLast();
                }
            }
        }

        if (stack.isEmpty()) answer = true;
        else answer = false;

        return answer;
    }
}
