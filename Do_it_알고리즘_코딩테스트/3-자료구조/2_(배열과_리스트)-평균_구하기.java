import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int qnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int lar = 0;
        for (int i=0; i<qnt; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            lar = Math.max(lar, num);
        }

        System.out.println((double) (sum*100)/(qnt*lar));

        br.close();
    }
}
