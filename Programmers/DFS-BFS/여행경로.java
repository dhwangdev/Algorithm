import java.util.*;

class Solution {
    static int len;
    static boolean[] visit;
    static ArrayList<String> list;
    
    static void dfs(int depth, String[][] tickets, String input, String path) {
        if (depth==len) {
            list.add(path);
            return;
        }
        
        for (int idx=0; idx<len; idx++) {
            if (tickets[idx][0].equals(input) && !visit[idx]) {
                visit[idx] = true;
                dfs(depth+1, tickets, tickets[idx][1], path+" "+tickets[idx][1]);
                visit[idx] = false;
            }
        }
    }
    
    public String[] solution(String[][] tickets) {
        len = tickets.length;
        visit = new boolean[len];
        list = new ArrayList<>();
        
        dfs(0, tickets, "ICN", "ICN");
        
        Collections.sort(list);
        
        return list.get(0).split(" ");
    }
}
