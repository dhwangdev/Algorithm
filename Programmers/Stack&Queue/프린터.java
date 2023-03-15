import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> queue = new ArrayDeque<>();
        for (int i=0; i<priorities.length; i++) {
            queue.offerLast(new int[] {i, priorities[i]});
        }

        int order = 0;

        while (true) {
            int[] temp = queue.pollFirst();
            boolean isMax = true;

            for (int[] numArr: queue) {
                if (temp[1]<numArr[1]) {
                    queue.offerLast(temp);
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                order++;
                if (temp[0]==location) break;
            }
        }

        return order;
    }
}
