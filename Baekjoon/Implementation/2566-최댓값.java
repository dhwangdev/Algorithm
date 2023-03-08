import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int max = -1;
        int row = 0;
        int col = 0;

        for (int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (max<num) {
                    max = num;
                    row = i+1;
                    col = j+1;
                }
            }
        }

        sb.append(max+"\n").append(row + " " + col);

        System.out.println(sb.toString());

        br.close();
    }
}
