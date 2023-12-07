import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int qnt = Integer.parseInt(br.readLine());
        int[][] arrCol = new int[qnt][2];
        for (int i=0; i<qnt; i++) {
            st = new StringTokenizer(br.readLine());
            arrCol[i][0] = Integer.parseInt(st.nextToken());
            arrCol[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrCol, (int[] a, int[] b) -> {
            // end 시간 기준으로 정렬, end 시간이 같을시 start 시간으로 정렬
            if (a[1]==b[1]) return a[0]-b[0];
            else return a[1]-b[1];
        });

        int count = 0;
        int currEnd = 0;

        // currEnd <= start 이면 회의 가능
        for (int i=0; i<qnt; i++) {
            if (currEnd <= arrCol[i][0]) {
                currEnd = arrCol[i][1];
                count++;
            }
        }

        System.out.println(count);

        br.close();
    }
}
