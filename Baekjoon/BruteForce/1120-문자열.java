import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String sma = st.nextToken();
        String big = st.nextToken();
        int dif = big.length() - sma.length();

        int max = 0;
        for (int i=0; i<=dif; i++) {
            int count = 0;
            for (int j=0; j<sma.length(); j++) {
                if (sma.charAt(j)==big.charAt(j+i)) count++;
            }
            if (max<count) max = count;
        }
        System.out.println(sma.length() - max);

        br.close();
    }
}
