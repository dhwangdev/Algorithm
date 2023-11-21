import java.util.*;
import java.io.*;

public class Main {
    static int qnt, target;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        qnt = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        arr = new int[qnt];
        int low = 0;
        int high = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (high < arr[i]) high = arr[i];
        }

        int height = 0;

        while (low <= high) {
            height = (low+high)/2;
            long take = 0;

            for (int num: arr) {
                if (num>=height) take += (num-height);
            }

            // take >= target: raise height
            if (take >= target) low = height+1;
            // take < target: lower height
            else high = height-1;
        }

        System.out.println(high);

        br.close();
    }
}
