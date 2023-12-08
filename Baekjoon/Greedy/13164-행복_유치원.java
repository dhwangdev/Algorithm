import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int qnt = Integer.parseInt(st.nextToken());
        int group = Integer.parseInt(st.nextToken());
        int[] arr = new int[qnt];
        int[] dif = new int[qnt-1];
        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        long sum = 0;
        for (int i=0; i<qnt-1; i++) {
            arr[i+1] = Integer.parseInt(st.nextToken());
            dif[i] = arr[i+1] - arr[i];
            sum += dif[i];
        }

        Arrays.sort(dif);

        for (int i=dif.length-1; i>dif.length-group; i--) {
            sum -= dif[i];
        }

        System.out.println(sum);

        br.close();
    }
}
