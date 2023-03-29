import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];
        for (int i=0; i<len; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int left = 0;
        int right = 0;
        int max = 0;

        for (int i=0; i<len; i++) {
            if (arr[i]>max) {
                left++;
                max = arr[i];
            }
        }

        max = 0;

        for (int i=len-1; i>=0; i--) {
            if (arr[i]>max) {
                right++;
                max = arr[i];
            }
        }

        sb.append(left+"\n").append(right);

        System.out.println(sb.toString());

        br.close();
    }
}
