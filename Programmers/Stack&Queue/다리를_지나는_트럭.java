import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int curWeight = 0;
        int time = 0;
        int idx = 0;
        int done = 0;

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i=0; i<bridge_length; i++) {
            queue.offerLast(0);
        }

        while (true) {
            time++;
            int temp = queue.pollFirst();
            if (temp>0) {
                done++;
                if (done == truck_weights.length) break;
                curWeight -= temp;
            }

            if (idx < truck_weights.length && truck_weights[idx] + curWeight <= weight) {
                queue.offerLast(truck_weights[idx]);
                curWeight += truck_weights[idx];
                idx++;
            }
            else {
                queue.offerLast(0);
            }
        }
        return time;
    }
}
