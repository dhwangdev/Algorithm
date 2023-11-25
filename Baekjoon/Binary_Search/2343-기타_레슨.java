import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int qnt = Integer.parseInt(st.nextToken());
        int ray = Integer.parseInt(st.nextToken());
        int[] arr = new int[qnt];
        st = new StringTokenizer(br.readLine());
        int low = 0;
        int high = 0;
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        while (low <= high) {
            int mid = (low+high)/2;
            int sum = 0;
            int count = 0;

            for (int num: arr) {
                if (sum+num > mid) {
                    count++;
                    sum = 0;
                }
                sum += num;
            }

            count++;

            if (count > ray) low = mid+1;
            else high = mid-1;
        }

        System.out.println(low);

        br.close();
    }
}
