import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[][] mat = new int[y+1][x+1];
        int[][] ans = new int[y+1][x+1];
        for (int i=1; i<y+1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<x+1; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=1; i<y+1; i++) {
            for (int j=1; j<x+1; j++) {
                ans[i][j] = Math.max(ans[i-1][j], ans[i][j-1]) + mat[i][j];
            }
        }

        System.out.println(ans[y][x]);

        br.close();
    }
}
