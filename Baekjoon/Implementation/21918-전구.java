import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int qnt = Integer.parseInt(st.nextToken());
        int order = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] bulb = new int[qnt];
        for (int i=0; i<qnt; i++) {
            bulb[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0; i<order; i++) {
            st = new StringTokenizer(br.readLine());
            int com = Integer.parseInt(st.nextToken());
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            switch (com) {
                case 1:
                    bulb[fir-1] = sec;
                    break;
                case 2:
                    for (int idx=fir-1; idx<=sec-1; idx++) {
                        if (bulb[idx]==1) bulb[idx] = 0;
                        else bulb[idx] = 1;
                    }
                    break;
                case 3:
                    for (int idx=fir-1; idx<=sec-1; idx++) {
                        bulb[idx] = 0;
                    }
                    break;
                case 4:
                    for (int idx=fir-1; idx<=sec-1; idx++) {
                        bulb[idx] = 1;
                    }
                    break;
            }
        }

        for (int i=0; i<qnt; i++) {
            System.out.print(bulb[i] + " ");
        }

        br.close();
    }
}
