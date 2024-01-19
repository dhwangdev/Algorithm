import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Map<String, Integer> hm = new HashMap<>();
        List<String> arrList = new ArrayList<>();
        for (int i=0; i<num; i++) {
            String[] line = br.readLine().split("\\.");
            if (!hm.containsKey(line[1])) arrList.add(line[1]);
            hm.put(line[1], hm.getOrDefault(line[1], 0)+1);
        }

        Collections.sort(arrList);
        for (String str: arrList) {
            sb.append(str + " " + hm.get(str) + "\n");
        }

        System.out.println(sb);

        br.close();
    }
}
