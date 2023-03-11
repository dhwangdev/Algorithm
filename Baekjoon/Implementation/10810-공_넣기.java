import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int turn = Integer.parseInt(st.nextToken());

        int[] basket = new int[total];
        for (int tc=0; tc<turn; tc++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            for (int idx=start-1; idx<=end-1; idx++) {
                basket[idx] = num;
            }
        }

        for (int no: basket) {
            sb.append(no+" ");
        }

        System.out.println(sb.toString());

        br.close();
    }
}
