import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        char[][] mat = new char[5][15];
        for (int i=0; i<5; i++) {
            String line = br.readLine();
            for (int j=0; j<line.length(); j++) {
                mat[i][j] = line.charAt(j);
            }
        }
        
        for (int j=0; j<15; j++) {
            for (int i=0; i<5; i++) {
                if (mat[i][j]!='\0') sb.append(mat[i][j]);
            }
        }
        
        System.out.println(sb.toString());
        
        br.close();
    }
}
