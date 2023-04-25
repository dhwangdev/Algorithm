import java.util.*;
import java.io.*;

public class Main {
    static int len;
    static boolean[][] visit;
    static int[][] mat;
    static StringBuilder sb = new StringBuilder();
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static ArrayList<Integer> list = new ArrayList<>();

    static void bfs(int a, int b) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offerLast(new int[] {a, b});
        visit[a][b] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int[] temp = queue.pollFirst();
            count++;
            int nowY = temp[0];
            int nowX = temp[1];

            for (int dir=0; dir<4; dir++) {
                int nextY = nowY + dy[dir];
                int nextX = nowX + dx[dir];

                if (nextY<0 || nextX<0 || nextY >=len || nextX >=len) continue;
                if (visit[nextY][nextX] || mat[nextY][nextX]==0) continue;
                queue.offerLast(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;
            }
        }
        list.add(count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        len = Integer.parseInt(br.readLine());
        visit = new boolean[len][len];
        mat = new int[len][len];
        for (int i=0; i<len; i++) {
            String line = br.readLine();
            for (int j=0; j<len; j++) {
                mat[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        for (int i=0; i<len; i++) {
            for (int j=0; j<len; j++) {
                if (mat[i][j]==1 && !visit[i][j]) bfs(i, j);
            }
        }

        Collections.sort(list);

        sb.append(list.size()+"\n");
        for (int i=0; i<list.size(); i++) {
            sb.append(list.get(i)+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
