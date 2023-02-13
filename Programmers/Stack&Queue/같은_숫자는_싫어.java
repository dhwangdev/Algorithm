import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        for (int num: arr) {
            if (stack.isEmpty()) stack.offerLast(num);
            else {
                if (stack.peekLast()!=num) stack.offerLast(num);
            }
        }
        
        int[] answer = new int[stack.size()];
        int idx = 0;
        for (int num: stack) {
            answer[idx] = num;
            idx++;
        }

        return answer;
    }
}
