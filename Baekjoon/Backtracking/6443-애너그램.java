import java.util.*;
import java.io.*;

public class Main {
    static int T;
    static char[] arr, output;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth) {
        if (depth==arr.length) {
            for (int i=0; i<output.length; i++) {
                sb.append(output[i]);
            }
            sb.append("\n");
            return;
        }

        char before = '3';
        for (int idx=0; idx<arr.length; idx++) {
            if (!visit[idx] && before != arr[idx]) {
                visit[idx] = true;
                output[depth] = arr[idx];
                before = arr[idx];
                dfs(depth+1);
                visit[idx] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        for (int tc=0; tc<T; tc++) {
            arr = br.readLine().toCharArray();
            Arrays.sort(arr);
            output = new char[arr.length];
            visit = new boolean[arr.length];

            dfs(0);
        }

        System.out.println(sb);

        br.close();
    }
}
