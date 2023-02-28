import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            
            switch (st.nextToken()) {
                case "push_front":
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                
                case "push_back":
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                    
                case "pop_front":
                    if (!deque.isEmpty()) sb.append(deque.pollFirst()+"\n");
                    else sb.append("-1\n");
                    break;
                    
                case "pop_back":
                    if (!deque.isEmpty()) sb.append(deque.pollLast()+"\n");
                    else sb.append("-1\n");
                    break;
                    
                case "size":
                    sb.append(deque.size()+"\n");
                    break;
                    
                case "empty":
                    if (deque.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                    
                case "front":
                    if (!deque.isEmpty()) sb.append(deque.peekFirst()+"\n");
                    else sb.append("-1\n");
                    break;
                    
                case "back":
                    if (!deque.isEmpty()) sb.append(deque.peekLast()+"\n");
                    else sb.append("-1\n");
                    break;
            }
        }
        System.out.println(sb.toString());
        
        br.close();
    }
}
