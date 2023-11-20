import java.util.*;
import java.io.*;

public class Main {
    static int qnt, rayQnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        qnt = Integer.parseInt(st.nextToken());
        rayQnt = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = 0;
        arr = new int[qnt];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            // 가장 작은 레이 용량은 가장 큰 값으로 일단 설정
            if (start < arr[i]) start = arr[i];
            // 가장 큰 용량은 당연히 총합
            end += arr[i];
        }

        while (start <= end) {
            // 블루레이 용량 임의로 설정
            int ray = (start+end)/2;

            int sum = 0;
            int count = 0;

            for (int i=0; i<qnt; i++) {
                if (sum+arr[i] > ray) {
                    count++;
                    sum = 0;
                }
                sum += arr[i];
            }

            // 마지막 레이를 개수에 포함
            count++;

            // count==rayQnt일 경우 일단 ray 용량 더 작은것 가능한지 확인한다
            if (count <= rayQnt) end = ray-1;
            else start = ray+1;
        }

        // 최소 레이 용량을 찾기 때문에 start가 답이다
        System.out.println(start);

        br.close();
    }
}
