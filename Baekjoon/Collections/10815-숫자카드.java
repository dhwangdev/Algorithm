import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int lenCard = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        HashSet<Integer> control = new HashSet<>();
        while (st.hasMoreTokens()) {
            control.add(Integer.parseInt(st.nextToken()));
        }

        int lenExp = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (control.contains(num)) sb.append(1 + " ");
            else sb.append(0 + " ");
        }

        System.out.println(sb.toString());

        br.close();
    }
}
