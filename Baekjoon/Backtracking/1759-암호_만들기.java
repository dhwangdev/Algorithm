import java.util.*;
import java.io.*;

public class Main {
    static int lim, qnt;
    static char[] pick, arr;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth, int pos) {
        if (depth==lim) {
            if (check()) {
                for (char x: pick) sb.append(x);
                sb.append("\n");
            }
            return;
        }

        for (int idx=pos; idx<qnt; idx++) {
            pick[depth] = arr[idx];
            dfs(depth+1, idx+1);
        }
    }

    static boolean check() {
        int vow = 0;
        int con = 0;

        for (char x: pick) {
            if (x=='a' || x=='e' || x=='i' || x=='o' || x=='u') vow++;
            else con++;
        }

        if (vow>=1 && con>=2) return true;
        else return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //input
        st = new StringTokenizer(br.readLine());
        lim = Integer.parseInt(st.nextToken());
        qnt = Integer.parseInt(st.nextToken());
        pick = new char[lim];
        arr = new char[qnt];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<qnt; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        //sort arr
        Arrays.sort(arr);

        //backtrack
        dfs(0, 0);

        //ans
        System.out.println(sb);

        br.close();
    }
}
