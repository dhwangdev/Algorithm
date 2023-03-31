import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int dan = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());
        int max = 0;

        for (int num=1; num<=len; num++) {
            StringBuilder sb = new StringBuilder();
            max = Math.max(max, Integer.parseInt(sb.append(dan*num).reverse().toString()));
        }
        System.out.println(max);

        br.close();
    }
}
