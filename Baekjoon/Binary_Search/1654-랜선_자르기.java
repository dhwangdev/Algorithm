import java.util.*;
import java.io.*;

public class Main {
    static int qnt, lineQnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        qnt = Integer.parseInt(st.nextToken());
        lineQnt = Integer.parseInt(st.nextToken());
        arr = new int[qnt];
        long high = 0;
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (high < arr[i]) high = arr[i];
        }

        // line = (1+0)/2 == 0 되면 나중에 0으로 나누는 상황 때문
        long low = 1;
        long line = 0;

        while (low <= high) {
            line = (low+high)/2;

            long count = 0;

            for (int num: arr) count+=num/line;

            // count < lineQnt 면 line 감소
            if (count < lineQnt) high = line-1;

            // count >= lineQnt 면 line 증가
            else low = line+1;
        }

        // 최대 길이 찾기 때문에 high
        System.out.println(high);

        br.close();
    }
}
