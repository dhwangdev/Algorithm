import java.util.*;
import java.io.*;

public class Main {
    static int tc, qnt, findQnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        tc = Integer.parseInt(br.readLine());
        for (int t=0; t<tc; t++) {
            qnt = Integer.parseInt(br.readLine());
            arr = new int[qnt];
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<qnt; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            findQnt =  Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<findQnt; i++) {
                int num = Integer.parseInt(st.nextToken());

                int start = 0;
                int end = qnt-1;
                boolean exist = false;

                while (start <= end) {
                    int mid = (start+end)/2;

                    if (num < arr[mid]) end = mid-1;
                    else if (num > arr[mid]) start = mid+1;
                    else {
                        sb.append("1\n");
                        exist = true;
                        break;
                    }
                }

                if (!exist) sb.append("0\n");
            }
        }

        System.out.println(sb);

        br.close();
    }
}
