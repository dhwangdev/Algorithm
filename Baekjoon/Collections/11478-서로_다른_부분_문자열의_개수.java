import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        HashSet<String> hs = new HashSet<>();
        for (int i=0; i<=line.length()-1; i++) {
            for (int j=i+1; j<=line.length(); j++) {
                hs.add(line.substring(i, j));
            }
        }

        System.out.println(hs.size());

        br.close();
    }
}
