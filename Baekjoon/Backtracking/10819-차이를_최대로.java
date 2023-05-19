import java.util.*;
import java.io.*;

public class Main {
    static int len, max;
    static int[] arr, output;
    static boolean[] visit;

    static void dfs(int depth) {
        if (depth==len) {
            int num = calc(output);
            if (max < num) max = num;
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

    static int calc(int[] xy) {
        int temp = 0;
        for (int dex=1; dex<len; dex++) {
            temp += Math.abs(xy[dex-1] - xy[dex]);
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        len = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[len];
        for (int i=0; i<len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        max = Integer.MIN_VALUE;
        output = new int[len];
        visit = new boolean[len];

        dfs(0);
        System.out.println(max);

        br.close();
    }
}
