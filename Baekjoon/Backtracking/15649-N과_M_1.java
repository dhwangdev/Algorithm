import java.util.*;
import java.io.*;

public class Main {
    static int len, lim;
    static boolean[] visit;
    static int[] arr, res;
    static StringBuilder sb = new StringBuilder();

    static void perm(int depth) {
        if (depth==lim) {
            for (int i=0; i<lim; i++) {
                sb.append(res[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for (int idx=0; idx<len; idx++) {
            if (!visit[idx]) {
                visit[idx] = true;
                res[depth] = arr[idx];
                perm(depth+1);
                visit[idx] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        len = Integer.parseInt(st.nextToken());
        lim = Integer.parseInt(st.nextToken());

        visit = new boolean[len];
        arr = new int[len];
        for (int i=0; i<len; i++) {
            arr[i] = i+1;
        }
        res = new int[lim];

        perm(0);

        System.out.println(sb);

        br.close();
    }
}
