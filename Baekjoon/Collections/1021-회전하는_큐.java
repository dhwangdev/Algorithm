import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int lenDeque = Integer.parseInt(st.nextToken());
        int lenArr = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[lenArr];
        for (int i=0; i<lenArr; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        LinkedList<Integer> deque = new LinkedList<>();
        for (int no=1; no<=lenDeque; no++) {
            deque.offerLast(no);
        }

        int count = 0;
        int move = 0;

        for (int num: arr) {
            if (deque.indexOf(num) <= deque.size()/2) {
                move = deque.indexOf(num);
                for (int j=0; j<move; j++) {
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            }

            else {
                move = deque.size()-deque.indexOf(num);
                for (int j=0; j<move; j++) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }

            deque.pollFirst();
        }
        System.out.println(count);

        br.close();
    }
}
