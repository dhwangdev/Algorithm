import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        int[] x = new int[len];
        int[] y = new int[len];
        int xMax = -10_001;
        int xMin = 10_001;
        int yMax = -10_001;
        int yMin = 10_001;
        for (int i=0; i<len; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());

            xMax = Math.max(xMax, x[i]);
            xMin = Math.min(xMin, x[i]);
            yMax = Math.max(yMax, y[i]);
            yMin = Math.min(yMin, y[i]);
        }

        System.out.println((xMax-xMin) * (yMax-yMin));

        br.close();
    }
}
