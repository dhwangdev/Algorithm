import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = 0;
        int[] arr = new int[9];
        for (int i=0; i<9; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            total += num;
        }

        int diff = total - 100;
        int culprit1 = 0;
        int culprit2 = 0;

        outer:
        for (int i=0; i<=7; i++) {
            for (int j=i+1; j<=8; j++) {
                if (arr[i]+arr[j]==diff) {
                    culprit1 = arr[i];
                    culprit2 = arr[j];
                    break outer;
                }
            }
        }

        Arrays.sort(arr);

        for (int i=0; i<9; i++) {
            if (arr[i] == culprit1 || arr[i] == culprit2) continue;
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
