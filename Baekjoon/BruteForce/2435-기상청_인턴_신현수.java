import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[len];
        for (int i=0; i<len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = -101;
        for (int i=0; i<=len-end; i++) {
            int sum = 0;
            for (int j=i; j<=i+end-1; j++) {
                sum += arr[j];
            }
            if (max<sum) max = sum;
        }
        System.out.println(max);

        br.close();
    }
}
