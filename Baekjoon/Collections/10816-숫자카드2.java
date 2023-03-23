import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int lenExp = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hmExp = new HashMap<>();
        for (int i=0; i<lenExp; i++) {
            int num = Integer.parseInt(st.nextToken());
            hmExp.put(num, hmExp.getOrDefault(num, 0)+1);
        }

        int lenCon = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<lenCon; i++) {
            int no = Integer.parseInt(st.nextToken());
            sb.append(hmExp.getOrDefault(no, 0) + " ");
        }

        System.out.println(sb.toString());

        br.close();
    }
}
