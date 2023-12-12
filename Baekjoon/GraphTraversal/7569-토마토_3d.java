import java.util.*;
import java.io.*;

public class Main {
    static int x, y, z, day;
    static int[][][] mat;
    static Queue<int[]> queue = new ArrayDeque<>();

    // 12, 3, 6, 9, 위, 아래
    static int[] dy = {-1, 0, 1, 0, 0, 0};
    static int[] dx = {0, 1, 0, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static void bfs() {
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i=0; i<6; i++) {
                int nextY = temp[0]+dy[i];
                int nextX = temp[1]+dx[i];
                int nextZ = temp[2]+dz[i];

                if (nextY<0 || nextY==y || nextX<0 || nextX==x || nextZ<0 || nextZ==z) continue;
                if (mat[nextY][nextX][nextZ]!=0) continue;

                mat[nextY][nextX][nextZ] = 1;
                queue.offer(new int[] {nextY, nextX, nextZ, temp[3]+1});
            }

            day = temp[3];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        z = Integer.parseInt(st.nextToken());
        mat = new int[y][x][z];

        for (int n=0; n<z; n++) {
            for (int i=0; i<y; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<x; j++) {
                    mat[i][j][n] = Integer.parseInt(st.nextToken());
                    if (mat[i][j][n]==1) queue.offer(new int[] {i, j, n, 0});
                }
            }
        }

        bfs();

        // 안 익은 토마토 확인
        boolean done = true;
        outer:
        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                for (int k=0; k<z; k++) {
                    if (mat[i][j][k]==0) {
                        done = false;
                        break outer;
                    }
                }
            }
        }

        if (!done) System.out.println(-1);
        else System.out.println(day);

        br.close();
    }
}
