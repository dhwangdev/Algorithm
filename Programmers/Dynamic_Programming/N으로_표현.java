import java.util.*;

class Solution {
    public int solution(int N, int number) {
        // ArrayList 안에 Set 초기화
        ArrayList<HashSet<Integer>> dp = new ArrayList<>();
        for (int i=0; i<=8; i++) {
            dp.add(new HashSet<>());
        }
        
        // dp 완성하기
        dp.get(1).add(N);
        if (N==number) return 1;
        for (int i=2; i<=8; i++) {
            for (int j=1; j<i; j++) {
                HashSet<Integer> preSet = dp.get(j);
                HashSet<Integer> postSet = dp.get(i-j);
                for (int preNum: preSet) {
                    for (int postNum: postSet) {
                        dp.get(i).add(preNum + postNum);
                        dp.get(i).add(preNum - postNum);
                        dp.get(i).add(preNum * postNum);
                        if (postNum!=0) dp.get(i).add(preNum/postNum);
                    }
                }
            }
            
            dp.get(i).add(Integer.parseInt(String.valueOf(N).repeat(i)));
            
            if (dp.get(i).contains(number)) return i;
        }
        
        return -1;
    }
}
