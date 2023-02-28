import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] day = new int[progresses.length];
        for (int i=0; i<progresses.length; i++) {
            day[i] = (int) Math.ceil((double) (100-progresses[i])/speeds[i]);
        }
        
        ArrayList<Integer> ansList = new ArrayList<>();
        int std = day[0];
        int count = 0;
        for (int num: day) {
            if (std>=num) count++;
            else {
                ansList.add(count);
                std = num;
                count = 1;
            }
        }
        ansList.add(count);
        
        int[] answer = new int[ansList.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = ansList.get(i);
        }
        
        return answer;
    }
}
