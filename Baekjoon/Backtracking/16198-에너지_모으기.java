import java.util.*;
import java.io.*;

public class Main {
    static int qnt, max;
    static List<Integer> arrList;

    static void dfs(int sum) {
        if (arrList.size()==2) {
            max = Math.max(max, sum);
            return;
        }

        for (int i=1; i<=arrList.size()-2; i++) {
            int curr = arrList.get(i);
            int tempSum = arrList.get(i-1) * arrList.get(i+1);
            arrList.remove(i);
            dfs(sum + tempSum);
            arrList.add(i, curr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        qnt = Integer.parseInt(br.readLine());
        arrList = new ArrayList<>(qnt);
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<qnt; i++) {
            arrList.add(Integer.parseInt(st.nextToken()));
        }

        dfs(0);

        System.out.println(max);

        br.close();
    }
}
