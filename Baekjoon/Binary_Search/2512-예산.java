import java.util.*;
import java.io.*;

public class Main {
    static int qnt, budget;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        qnt = Integer.parseInt(br.readLine());
        int low = 1;
        int high = 1;
        arr = new int[qnt];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (high < arr[i]) high = arr[i];
        }
        budget = Integer.parseInt(br.readLine());

        int fund = 0;

        while (low <= high) {
            fund = (low+high)/2;
            long sum = 0;

            for (int num: arr) {
                if (num < fund) sum += num;
                else sum += fund;
            }

            if (sum <= budget) low = fund+1;
            else high = fund-1;
        }

        System.out.println(high);
        
        br.close();
    }
}
