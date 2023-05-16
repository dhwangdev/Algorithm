import java.util.*;
import java.io.*;

public class Main {
    static int len, loss, count;
    static int[] arr;
    static boolean[] visit;

    static void dfs(int depth, int curr) {
        if (curr<500) return;

        if (depth==len) {
            count++;
            return;
        }

        for (int idx=0; idx<len; idx++) {
            if (!visit[idx]) {
                visit[idx] = true;
                dfs(depth+1, curr+arr[idx]-loss);
                visit[idx] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        len = Integer.parseInt(st.nextToken());
        loss = Integer.parseInt(st.nextToken());
        arr = new int[len];
        visit = new boolean[len];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 500);
        System.out.println(count);

        br.close();
    }
}
