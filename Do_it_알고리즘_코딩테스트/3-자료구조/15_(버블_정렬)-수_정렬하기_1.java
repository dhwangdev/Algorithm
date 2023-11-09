import java.util.*;
import java.io.*;

public class Main {
    static int qnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        qnt = Integer.parseInt(br.readLine());
        arr = new int[qnt];
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<qnt; i++) {
            for (int j=qnt-1; j>=i+1; j--) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        for (int num: arr) {
            sb.append(num+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
