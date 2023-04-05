import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int digit = Integer.parseInt(st.nextToken());

        int start = 1;
        int count = 0;

        while (start<=len) {
            for (int num=start; num>0; num/=10) {
                if (num%10==digit) count++;
            }
            start++;
        }
        System.out.println(count);

        br.close();
    }
}
