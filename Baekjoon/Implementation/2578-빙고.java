import java.util.*;
import java.io.*;

public class Main {
    static int[][] mat;
    static int[] flat, pillar;
    static int down, up;

    static void find(int num) {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (mat[i][j]==num) {
                    flat[j]++;
                    pillar[i]++;
                    if (i==j) down++;
                    if (i+j==4) up++;
                }
            }
        }
    }

    static int bingo() {
        int count = 0;
        for (int ite=0; ite<5; ite++) {
            if (flat[ite]==5) count++;
            if (pillar[ite]==5) count++;
        }

        if (down==5) count++;
        if (up==5) count++;

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        mat = new int[5][5];
        flat = new int[5];
        pillar = new int[5];
        for (int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] numMat = new int[5][5];
        for (int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; j++) {
                numMat[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int order =0;
        outerloop:
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                order++;
                find(numMat[i][j]);
                if (bingo()>=3) break outerloop;
            }
        }

        System.out.println(order);

        br.close();
    }
}
