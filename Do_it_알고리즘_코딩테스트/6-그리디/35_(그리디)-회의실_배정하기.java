import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int meeting = Integer.parseInt(br.readLine());
        int[][] arr = new int[meeting][2];
        for (int i=0; i<meeting; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (int[] small, int[] big) -> {
            if (small[1]==big[1]) return small[0]-big[0];
            else return small[1]-big[1];
        });

        int count = 0;
        int currEnd = 0;
        for (int i=0; i<meeting; i++) {
            if (currEnd <= arr[i][0]) {
                count++;
                currEnd = arr[i][1];
            }
        }

        System.out.println(count);

        br.close();
    }
}
