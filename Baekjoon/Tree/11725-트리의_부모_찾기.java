import java.util.*;
import java.io.*;

public class Main {
    static int node;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;
    static int[] arr;

    static void dfs(int x) {
        visit[x] = true;

        for (int num: adj.get(x)) {
            if (!visit[num]) {
                arr[num] = x;
                dfs(num);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        node = Integer.parseInt(br.readLine());
        adj = new ArrayList<>(node+1);
        for (int i=0; i<node+1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i=0; i<node-1; i++) {
            st = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            adj.get(fir).add(sec);
            adj.get(sec).add(fir);
        }
        visit = new boolean[node+1];
        arr = new int[node+1];

        dfs(1);

        for (int i=2; i<=node; i++) {
            sb.append(arr[i]+"\n");
        }

        System.out.println(sb);
        
        br.close();
    }
}
