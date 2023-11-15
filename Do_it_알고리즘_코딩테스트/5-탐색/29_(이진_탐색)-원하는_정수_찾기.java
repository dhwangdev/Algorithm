import java.util.*;
import java.io.*;

public class Main {
    static int qnt, numQnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        qnt = Integer.parseInt(br.readLine());
        arr = new int[qnt];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        numQnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<numQnt; i++) {
            int num = Integer.parseInt(st.nextToken());

            int start = 0;
            int end = qnt-1;
            boolean find = false;

            while (start <= end) {
                int mid = (start+end)/2;

                if (num<arr[mid]) end = mid-1;

                else if (arr[mid]<num) start = mid+1;

                else {
                    find = true;
                    break;
                }
            }

            if (find) sb.append("1\n");
            else sb.append("0\n");
        }

        System.out.println(sb);

        br.close();
    }
}
