import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int qnt = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());
        int[] arr = new int[qnt+1];
        st = new StringTokenizer(br.readLine());
        arr[0] = 0;
        for (int i=1; i<=qnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
        }

        for (int i=0; i<question; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            sb.append(arr[end]-arr[start-1]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
