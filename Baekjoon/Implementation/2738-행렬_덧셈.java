import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        
        int[][] beforeSum = new int[row][col];
        for (int i=0; i<row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<col; j++) {
                beforeSum[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // after Sum
        for (int i=0; i<row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<col; j++) {
                sb.append(beforeSum[i][j]+Integer.parseInt(st.nextToken())+" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
        
        br.close();
    }
}
