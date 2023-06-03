import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());

        int[][] tri = new int[len+row][len+row];
        tri[0][0] = 1;
        for (int i=1; i<tri.length; i++) {
            // leftmost
            tri[i][0] = 1;

            // rightmost
            tri[i][i] = 1;

            // middle
            for (int j=1; j<=i-1; j++) {
                tri[i][j] = tri[i-1][j-1] + tri[i-1][j];
            }
        }

        int sum = 0;
        int num = 1;

        for (int i=0; i<len; i++) {
            for (int j=0; j<num; j++) {
                sum += tri[row-1+i][col-1+j];
            }
            num++;
        }

        System.out.println(sum);

        br.close();
    }
}
