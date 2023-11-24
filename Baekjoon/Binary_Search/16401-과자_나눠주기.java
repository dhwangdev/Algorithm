import java.util.*;
import java.io.*;

public class Main {
    static int people, snackQnt;
    static int[] snackArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        people = Integer.parseInt(st.nextToken());
        snackQnt = Integer.parseInt(st.nextToken());
        snackArr = new int[snackQnt];
        st = new StringTokenizer(br.readLine());
        int low = 1;
        int high = 1;
        for (int i=0; i<snackQnt; i++) {
            snackArr[i] = Integer.parseInt(st.nextToken());
            if (high < snackArr[i]) high = snackArr[i];
        }

        while (low <= high) {
            int snackLen = (low+high)/2;
            int count = 0;

            for (int num: snackArr) count += num/snackLen;

            if (count < people) high = snackLen-1;
            else low = snackLen+1;
        }

        System.out.println(high);

        br.close();
    }
}
