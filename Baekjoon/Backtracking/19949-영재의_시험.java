import java.util.*;
import java.io.*;

public class Main {
    static int[] arr, output;
    static int count;

    static void dfs(int depth, int correct) {
        if (depth==10) {
            if (correct>=5) count++;
            return;
        }

        for (int mcq=1; mcq<=5; mcq++) {
            if (depth>1) {
                if (output[depth-2]==mcq && output[depth-1]==mcq) continue;
            }

            output[depth] = mcq;

            if (output[depth]==arr[depth]) dfs(depth+1, correct+1);
            else dfs(depth+1, correct);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        arr = new int[10];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        output = new int[10];

        dfs(0, 0);
        System.out.println(count);

        br.close();
    }
}
