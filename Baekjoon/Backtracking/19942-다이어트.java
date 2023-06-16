import java.util.*;
import java.io.*;

public class Main {
    static int num, sum, min;
    static int[] pro, fat, carb, vit, cost;
    static boolean[] visit;
    static StringBuilder temp = new StringBuilder();
    static String used;

    static boolean check() {
        int protein = 0;
        int lipid = 0;
        int carbohydrate = 0;
        int vitamin = 0;
        sum = 0;
        temp.setLength(0);

        for (int idx=1; idx<=num; idx++) {
            if (visit[idx]) {
                protein += pro[idx];
                lipid += fat[idx];
                carbohydrate += carb[idx];
                vitamin += vit[idx];
                sum += cost[idx];
                temp.append(idx).append(" ");
            }
        }

        return protein>=pro[0] && lipid>=fat[0] && carbohydrate>=carb[0] && vitamin>=vit[0];
    }

    static void dfs(int depth) {
        if (depth==num+1) {
            if (check()) {
                if (sum<min) {
                    min = sum;
                    used = temp.toString();
                }
                else if (sum==min) {
                    if (used.compareTo(temp.toString())>0) {
                        used = temp.toString();
                    }
                }
            }
            return;
        }

        visit[depth] = true;
        dfs(depth+1);
        visit[depth] = false;
        dfs(depth+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        num = Integer.parseInt(br.readLine());
        pro = new int[num+1];
        fat = new int[num+1];
        carb = new int[num+1];
        vit = new int[num+1];
        cost = new int[num+1];
        visit = new boolean[num+1];
        min = 15*500+1;
        used = "";

        st = new StringTokenizer(br.readLine());
        pro[0] = Integer.parseInt(st.nextToken());
        fat[0] = Integer.parseInt(st.nextToken());
        carb[0] = Integer.parseInt(st.nextToken());
        vit[0] = Integer.parseInt(st.nextToken());
        for (int i=1; i<=num; i++) {
            st = new StringTokenizer(br.readLine());
            pro[i] = Integer.parseInt(st.nextToken());
            fat[i] = Integer.parseInt(st.nextToken());
            carb[i] = Integer.parseInt(st.nextToken());
            vit[i] = Integer.parseInt(st.nextToken());
            cost[i] = Integer.parseInt(st.nextToken());
        }


        dfs(1);
        if (min == 15*500+1) System.out.println(-1);
        else {
            System.out.println(min);
            System.out.println(used);
        }

        br.close();
    }
}
