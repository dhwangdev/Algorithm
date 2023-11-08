import java.util.*;
import java.io.*;

public class Main {
    static int qnt;
    static ArrayList<String> arrList;
    static StringBuilder sb = new StringBuilder();
    static HashSet<Character> hs;
    static boolean bracket;

    static void check() {
        StringBuilder temp = new StringBuilder();

        // 각 단어 첫 철자 확인
        for (String word: arrList) {
            if (!hs.contains(Character.toUpperCase(word.charAt(0))) && !bracket) {
                hs.add(Character.toUpperCase(word.charAt(0)));
                temp.append("["+word.charAt(0)+"]"+word.substring(1));
                bracket = true;
            }
            else temp.append(word);

            temp.append(" ");
        }
        if (bracket) {
            sb.append(temp);
            return;
        }
        else temp.setLength(0);

        // 각 단어의 나머지 철자 확인
        for (String word: arrList) {
            temp.append(word.charAt(0));
            for (int i=1; i<word.length(); i++) {
                if (!hs.contains(Character.toUpperCase(word.charAt(i))) && !bracket) {
                    hs.add(Character.toUpperCase(word.charAt(i)));
                    temp.append("["+word.charAt(i)+"]");
                    bracket = true;
                }
                else temp.append(word.charAt(i));
            }
            temp.append(" ");
        }

        sb.append(temp);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        qnt = Integer.parseInt(br.readLine());
        hs = new HashSet<>();
        for (int ite=0; ite<qnt; ite++) {
            st = new StringTokenizer(br.readLine());
            arrList = new ArrayList<>();
            while (st.hasMoreTokens()) arrList.add(st.nextToken());

            bracket = false;

            check();
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
