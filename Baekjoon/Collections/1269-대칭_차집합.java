import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int lenA = Integer.parseInt(st.nextToken());
        int lenB = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<lenA; i++) {
            hm.put(Integer.parseInt(st.nextToken()), 0);
        }

        int count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<lenB; i++) {
            if (hm.containsKey(Integer.parseInt(st.nextToken()))) count++;
        }

        System.out.println(lenA+lenB-2*count);

        br.close();
    }
}
