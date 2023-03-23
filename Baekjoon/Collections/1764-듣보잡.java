import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int noHear = Integer.parseInt(st.nextToken());
        int noSee = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i=0; i<noHear; i++) {
            hm.put(br.readLine(), 0);
        }

        ArrayList<String> arrList = new ArrayList<>();
        for (int i=0; i<noSee; i++) {
            String word = br.readLine();
            if (hm.containsKey(word)) arrList.add(word);
        }

        Collections.sort(arrList);

        sb.append(arrList.size()+"\n");
        for (String word: arrList) {
            sb.append(word+"\n");
        }

        System.out.println(sb.toString());

        br.close();
    }
}
