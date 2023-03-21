import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int lenCon = Integer.parseInt(st.nextToken());
        int lenExp = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i=0; i<lenCon; i++) {
            hm.put(br.readLine(), 0);
        }

        int count = 0;
        for (int i=0; i<lenExp; i++) {
            if (hm.containsKey(br.readLine())) count++;
        }

        System.out.println(count);

        br.close();
    }
}
