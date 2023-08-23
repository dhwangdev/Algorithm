import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int order = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<String>> dp = new ArrayList<>(num+3);
        for (int i=0; i<=num+2; i++) {
            dp.add(new ArrayList<>());
        }

        dp.get(1).add("1");
        dp.get(2).add("1+1");
        dp.get(2).add("2");
        dp.get(3).add("1+1+1");
        dp.get(3).add("1+2");
        dp.get(3).add("2+1");
        dp.get(3).add("3");

        for (int i=4; i<=num; i++) {
            for (int j=1; j<=3; j++) {
                for (String curr: dp.get(i-j)) {
                    dp.get(i).add(curr + "+" + j);
                }
            }
        }

        Collections.sort(dp.get(num));

        if (order > dp.get(num).size()) System.out.println(-1);
        else System.out.println(dp.get(num).get(order-1));

        br.close();
    }
}
