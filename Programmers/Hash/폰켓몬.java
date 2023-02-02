import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> unique = new HashSet<>();
        for (int no: nums) {
            unique.add(no);
        }
        
        if (unique.size() < nums.length/2) answer = unique.size();
        else answer = nums.length/2;
        
        return answer;
    }
}
