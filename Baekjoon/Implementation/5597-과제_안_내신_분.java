import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<28; i++) {
            hs.add(Integer.parseInt(br.readLine()));
        }

        for (int num=1; num<=30; num++) {
            if (!hs.contains(num)) sb.append(num+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
