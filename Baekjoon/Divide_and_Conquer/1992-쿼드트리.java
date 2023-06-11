import java.io.*;

public class Main {
    static int len;
    static int[][] mat;
    static StringBuilder sb = new StringBuilder();

    static void div(int row, int col, int num) {
        for (int y=row; y<row+num; y++) {
            for (int x=col; x<col+num; x++) {
                if (mat[row][col] != mat[y][x]) {
                    sb.append("(");
                    div(row, col, num/2);
                    div(row, col+num/2, num/2);
                    div(row+num/2, col, num/2);
                    div(row+num/2, col+num/2, num/2);
                    sb.append(")");

                    return;
                }
            }
        }

        sb.append(mat[row][col]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        len = Integer.parseInt(br.readLine());
        mat = new int[len][len];
        for (int i=0; i<len; i++) {
            String line = br.readLine();
            for (int j=0; j<len; j++) {
                mat[i][j] = line.charAt(j) - '0';
            }
        }

        div(0, 0, len);
        System.out.println(sb);

        br.close();
    }
}
