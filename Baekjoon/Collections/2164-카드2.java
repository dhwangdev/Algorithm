import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int num=1; num<=N; num++) {
            queue.offerLast(num);
        }
        
        while (queue.size()!=1) {
            queue.pollFirst();
            queue.offerLast(queue.pollFirst());            
        }
        
        System.out.println(queue.peekFirst());       
        
        br.close();
    }
}
