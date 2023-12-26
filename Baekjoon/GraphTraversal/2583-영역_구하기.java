import java.util.*;
import java.io.*;

public class Main {
    static int y, x, quad, isleCount;
    static ArrayList<Integer> area;
    static int[][] mat;
    static boolean[][] visit;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static void bfs(int row, int col) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {row, col});
        visit[row][col] = true;
        int areaCount = 0;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            areaCount++;

            for (int i=0; i<4; i++) {
                int nextY = temp[0] + dy[i];
                int nextX = temp[1] + dx[i];

                if (nextX<0 || nextY<0 || nextX==x || nextY==y) continue;
                if (mat[nextY][nextX]==1 || visit[nextY][nextX]) continue;

                queue.offer(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;

            }
        }

        area.add(areaCount);
        isleCount++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        quad = Integer.parseInt(st.nextToken());
        mat = new int[y][x];
        visit = new boolean[y][x];
        area = new ArrayList<>();
        for (int i=0; i<quad; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int r=y1; r<y2; r++) {
                for (int c=x1; c<x2; c++) {
                    mat[r][c] = 1;
                }
            }
        }

        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (mat[i][j]==0 && !visit[i][j]) {
                    bfs(i, j);
                }
            }
        }

        sb.append(isleCount+"\n");

        Collections.sort(area);
        for (int num: area) {
            sb.append(num+" ");
        }

        System.out.println(sb);

        br.close();
    }
}
