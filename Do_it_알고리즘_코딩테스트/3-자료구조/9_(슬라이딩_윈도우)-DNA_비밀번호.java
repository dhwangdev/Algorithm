import java.util.*;
import java.io.*;

public class Main {
    static int qnt, part, count;
    static char[] strand;
    static int[] dna, curr;

    static void compare() {
        int checkFour = 0;
        for (int i=0; i<4; i++) {
            if (dna[i]<=curr[i]) checkFour++;
            else return;
        }
        if (checkFour==4) count++;
    }

    static void add(char ab) {
        switch (ab) {
            case 'A':
                curr[0]++;
                break;
            case 'C':
                curr[1]++;
                break;
            case 'G':
                curr[2]++;
                break;
            case'T':
                curr[3]++;
                break;
        }
    }

    static void remove(char ab) {
        switch (ab) {
            case 'A':
                curr[0]--;
                break;
            case 'C':
                curr[1]--;
                break;
            case 'G':
                curr[2]--;
                break;
            case'T':
                curr[3]--;
                break;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        count = 0;
        st = new StringTokenizer(br.readLine());
        qnt = Integer.parseInt(st.nextToken());
        part = Integer.parseInt(st.nextToken());
        strand = br.readLine().toCharArray();
        dna = new int[4];
        curr = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) {
            dna[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<part; i++) {
            add(strand[i]);
        }
        compare();

        for (int i=part; i<qnt; i++) {
            int j = i - part;

            add(strand[i]);
            remove(strand[j]);

            compare();
        }

        System.out.println(count);
        
        br.close();
    }
}
