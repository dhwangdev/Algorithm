import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] count = new int[3];

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == pattern[0][i%pattern[0].length]) count[0]++;
            if (answers[i] == pattern[1][i%pattern[1].length]) count[1]++;
            if (answers[i] == pattern[2][i%pattern[2].length]) count[2]++;
        }

        int maxNum = Math.max(count[0], Math.max(count[1], count[2]));

        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i=0; i<3; i++) {
            if (maxNum == count[i]) arrList.add(i+1);
        }

        int[] ans = new int[arrList.size()];
        for (int i=0; i<arrList.size(); i++) {
            ans[i] = arrList.get(i);
        }

        return ans;
    }
}
