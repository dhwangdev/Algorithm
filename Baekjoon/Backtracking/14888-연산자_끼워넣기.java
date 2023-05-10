import java.util.*;
import java.io.*;

public class Main {
    static int len, max, min;
    static int[] arr, operator;

    static void dfs(int depth, int curr) {
        if (depth==len) {
            max = Math.max(curr, max);
            min = Math.min(curr, min);
            return;
        }

        for (int idx=0; idx<4; idx++) {
            if (operator[idx] != 0) {
                operator[idx]--;
                switch (idx) {
                    case 0:
                        dfs(depth+1, curr+arr[depth]);
                        break;
                    case 1:
                        dfs(depth+1, curr-arr[depth]);
                        break;
                    case 2:
                        dfs(depth+1, curr*arr[depth]);
                        break;
                    case 3:
                        dfs(depth+1, curr/arr[depth]);
                        break;
                }
                operator[idx]++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        len = Integer.parseInt(br.readLine());
        arr = new int[len];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        operator = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        dfs(1, arr[0]);
        System.out.println(max);
        System.out.println(min);

        br.close();
    }
}
