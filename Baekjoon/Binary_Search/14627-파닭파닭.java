import java.util.*;
import java.io.*;

public class Main {
    static int qnt, onionQnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        qnt = Integer.parseInt(st.nextToken());
        onionQnt = Integer.parseInt(st.nextToken());
        int low = 1;
        int high = 0;
        int onion = 0;
        long total = 0;
        arr = new int[qnt];
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (high < arr[i]) high = arr[i];
            total += arr[i];
        }

        while (low <= high) {
            onion = (low+high)/2;
            int count = 0;

            for (int num: arr) {
                count += num/onion;
            }

            // count >= onionQnt: onion inc
            if (count>=onionQnt) low = onion+1;
            // count < onionQnt: onion dec
            else high = onion-1;
        }

        System.out.println(total-(long)high*onionQnt);

        br.close();
    }
}
