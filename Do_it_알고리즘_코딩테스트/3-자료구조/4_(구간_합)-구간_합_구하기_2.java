import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int qnt = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());
        int[][] mat = new int[qnt+1][qnt+1];
        for (int i=1; i<=qnt; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=qnt; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken())
                        + mat[i-1][j] + mat[i][j-1] -mat[i-1][j-1];
            }
        }

        for (int i=0; i<question; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            sb.append(mat[x2][y2] - mat[x1-1][y2] - mat[x2][y1-1]
            + mat[x1-1][y1-1] +"\n");
        }
        System.out.println(sb);

        br.close();
    }
}
