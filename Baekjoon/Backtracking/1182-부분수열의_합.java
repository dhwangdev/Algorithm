import java.util.*;
import java.io.*;

public class Main {
    static int len, target, count;
    static int[] arr;

    static void dfs(int depth, int curr) {
        if (depth==len) {
            if (curr==target) count++;
            return;
        }

        dfs(depth+1, curr+arr[depth]);
        dfs(depth+1, curr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        len = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[len];
        for (int i=0; i<len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        if (target==0) count -= 1;
        System.out.println(count);

        br.close();
    }
}
