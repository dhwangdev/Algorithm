import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[] arr = new int[w];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<w; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;

        for (int idx=1; idx<w-1; idx++) {
            int left = 0;
            int right = 0;

            for (int ite=0; ite<=idx-1; ite++) {
                left = Math.max(left, arr[ite]);
            }

            for (int ite=idx+1; ite<w; ite++) {
                right = (Math.max(right, arr[ite]));
            }

            if (Math.min(left, right) > arr[idx]) {
                sum += (Math.min(left, right)-arr[idx]);
            }
        }

        System.out.println(sum);

        br.close();
    }
}
