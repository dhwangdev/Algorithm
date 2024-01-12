import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] change = {500, 100, 50, 10, 5, 1};
        int count = 0;
        int target = 1000 - Integer.parseInt(br.readLine());
        for (int num: change) {
            if (target>=num) {
                count += target/num;
                target %= num;
            }
        }

        System.out.println(count);

        br.close();
    }
}
