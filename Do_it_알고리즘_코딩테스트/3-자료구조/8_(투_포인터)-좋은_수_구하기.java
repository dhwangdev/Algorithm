import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int qnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        long[] arr = new long[qnt];
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int count = 0;

        for (int idx=0; idx<qnt; idx++) {
            int start = 0;
            int end = qnt-1;

            while (start < end) {
                if (arr[start]+arr[end] < arr[idx]) start++;
                else if (arr[start]+arr[end] > arr[idx]) end--;
                else {
                    if (start!=idx && end!=idx) {
                        count++;
                        break;
                    }
                    else if (start==idx) start++;
                    else if (end==idx) end--;
                }
            }
        }

        System.out.println(count);

        br.close();
    }
}
