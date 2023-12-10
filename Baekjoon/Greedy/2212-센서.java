import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int sensor = Integer.parseInt(br.readLine());
        int station = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        if (sensor<=station) {
            System.out.println(0);
        }
        else {
            int[] arr = new int[sensor];
            int[] dif = new int[sensor-1];
            for (int i=0; i<sensor; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            long sum = 0;
            for (int i=0; i<sensor-1; i++) {
                dif[i] = arr[i+1]-arr[i];
                sum += dif[i];
            }

            Arrays.sort(dif);

            for (int i=dif.length-1; i>dif.length-station; i--) {
                sum -= dif[i];
            }

            System.out.println(sum);
        }

        br.close();
    }
}
