import java.util.*;
import java.io.*;

public class Main {
    static int people, colorQnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        people = Integer.parseInt(st.nextToken());
        colorQnt = Integer.parseInt(st.nextToken());
        arr = new int[colorQnt];
        int low = 1, high = 1;
        for (int i=0; i<colorQnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (high < arr[i]) high = arr[i];
        }

        while (low <= high) {
            int mid = (low+high)/2;
            int count = 0;

            for (int num: arr) {
                if (num%mid==0) count += (num/mid);
                else count += (num/mid)+1;
            }

            if (count <= people) high = mid-1;
            else low = mid+1;
        }

        System.out.println(low);

        br.close();
    }
}
