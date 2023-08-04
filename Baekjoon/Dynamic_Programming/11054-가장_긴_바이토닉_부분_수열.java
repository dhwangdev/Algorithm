import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int qnt = Integer.parseInt(br.readLine());
        int[] arr = new int[qnt+1];
        int[] dpInc = new int[qnt+1];
        int[] dpDec = new int[qnt+1];

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=qnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dpInc[i] = 1;
            dpDec[i] = 1;
        }

        // LIS
        for (int i=1; i<=qnt; i++) {
            for (int j=1; j<i; j++) {
                if (arr[j]<arr[i] && dpInc[j]>=dpInc[i]) {
                    dpInc[i] = dpInc[j] + 1;
                }
            }
        }

        // LDS
        for (int i=qnt; i>=1; i--) {
            for (int j=qnt; j>i; j--) {
                if (arr[i]>arr[j] && dpDec[i]<=dpDec[j]) {
                    dpDec[i] = dpDec[j] + 1;
                }
            }
        }

        int most = 1;
        for (int i=1; i<=qnt; i++) {
            most = Math.max(most, dpInc[i]+dpDec[i]-1);
        }

        System.out.println(most);

        br.close();
    }
}
