import java.util.*;
import java.io.*;

public class Main {
    static int len, white, blue;
    static int[][] mat;

    static void div(int row, int col, int num) {
        for (int y=row; y<row+num; y++) {
            for (int x=col; x<col+num; x++) {
                if (mat[y][x] != mat[row][col]) {
                    div(row, col, num/2);
                    div(row, col+num/2, num/2);
                    div(row+num/2, col, num/2);
                    div(row+num/2, col+num/2, num/2);

                    return;
                }
            }
        }

        if (mat[row][col]==0) white++;
        else blue++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        len = Integer.parseInt(br.readLine());
        mat = new int[len][len];
        for (int i=0; i<len; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<len; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        div(0, 0, len);
        System.out.println(white);
        System.out.println(blue);

        br.close();
    }
}
