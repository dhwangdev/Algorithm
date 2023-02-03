import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> ran = new HashMap<>();
        for (String runner: participant) {
            ran.put(runner, ran.getOrDefault(runner, 0)+1);
        }
        for (String runner: completion) {
            ran.put(runner, ran.get(runner)-1);
        }
        
        for (String runner: ran.keySet()) {
            if (ran.get(runner)==1) answer = runner;
        }
        
        return answer;
    }
}
