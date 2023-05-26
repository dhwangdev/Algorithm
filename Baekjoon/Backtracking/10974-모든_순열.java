import java.util.*;
import java.io.*;

public class Main {
    static int len;
    static int[] arr, output;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth) {
        if (depth==len) {
            for (int i=0; i<len; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int idx=0; idx<len; idx++) {
            if (!visit[idx]) {
                visit[idx] = true;
                output[depth] = arr[idx];
                dfs(depth+1);
                visit[idx] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        len = Integer.parseInt(br.readLine());
        arr = new int[len];
        output = new int[len];
        visit = new boolean[len];
        for (int i=0; i<len; i++) {
            arr[i] = i+1;
        }
        dfs(0);
        System.out.println(sb);

        br.close();
    }
}
