import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=len; tc++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int count = 0;

            while (start<=end) {
                if (start==0) count++;
                else {
                    for (int num=start; num>0; num/=10) {
                        if (num%10==0) count++;
                    }
                }
                start++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
