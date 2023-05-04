import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int tc=1; tc<=10; tc++) {
            int len = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            for (int i=0; i<len; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            int comNum = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String temp = st.nextToken();
                switch (temp) {
                    case "I":
                        int pos = Integer.parseInt(st.nextToken());
                        int no = Integer.parseInt(st.nextToken());

                        for (int ite=0; ite<no; ite++) {
                            list.add(pos, Integer.parseInt(st.nextToken()));
                            pos++;
                        }
                        break;

                    case "D":
                        int posi = Integer.parseInt(st.nextToken());
                        int nom = Integer.parseInt(st.nextToken());
                        for (int ite=0; ite<nom; ite++) {
                            list.remove(posi);
                        }
                        break;

                    case "A":
                        int nume = Integer.parseInt(st.nextToken());
                        for (int ite=0; ite<nume; ite++) {
                            list.add(Integer.parseInt(st.nextToken()));
                        }
                        break;
                }
            }
            sb.append("#"+tc+" ");
            for (int k=0; k<10; k++) {
                sb.append(list.get(k)+" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
