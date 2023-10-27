import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int qnt = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());
        int[] arr = new int[qnt];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int start = 0;
        int end = qnt-1;
        int count = 0;

        while (start<end) {
            if (arr[start]+arr[end]==target) {
                count++;
                start++;
                end--;
            } else if (arr[start]+arr[end]>target) {
                end--;
            } else if (arr[start]+arr[end]<target) {
                start++;
            }
        }

        System.out.println(count);

        br.close();
    }
}
