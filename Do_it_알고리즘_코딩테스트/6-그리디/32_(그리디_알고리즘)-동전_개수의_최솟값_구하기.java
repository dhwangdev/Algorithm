import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int qnt = Integer.parseInt(st.nextToken());
        int amount = Integer.parseInt(st.nextToken());
        int[] coin = new int[qnt];
        for (int i=0; i<qnt; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int idx=qnt-1; idx>=0; idx--) {
            if (amount==0) break;

            if (amount/coin[idx]>0) {
                count += amount/coin[idx];
                amount %= coin[idx];
            }
        }

        System.out.println(count);

        br.close();
    }
}
