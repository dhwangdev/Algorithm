import java.util.*;
import java.io.*;

public class Main {
    static int len, count;
    static int[] arr;

    static void dfs(int depth) {
        if (depth==len) {
            count++;
            return;
        }

        for (int row=0; row<len; row++) {
            arr[depth] = row;

            if (canPut(depth)) {
                dfs(depth+1);
            }
        }
    }

    static boolean canPut(int col) {
        for (int idx=0; idx<col; idx++) {
            if (arr[col]==arr[idx]) {
                return false;
            }

            else if (Math.abs(col-idx)==Math.abs(arr[col]-arr[idx])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        len = Integer.parseInt(br.readLine());
        arr = new int[len];

        dfs(0);
        System.out.println(count);

        br.close();
    }
}
