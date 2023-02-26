import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Deque<Integer> queue = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch (st.nextToken()) {
			case "push": 
				queue.offerLast(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop":
				if (!queue.isEmpty()) sb.append(queue.pollFirst()+"\n");
				else sb.append("-1\n");
				break;
				
			case "size":
				sb.append(queue.size()+"\n");
				break;
				
			case "empty":
				if (queue.isEmpty()) sb.append("1\n");
				else sb.append("0\n");
				break;
				
			case "front":
				if (!queue.isEmpty()) sb.append(queue.peekFirst()+"\n");
				else sb.append("-1\n");
				break;
				
			case "back":
				if (!queue.isEmpty()) sb.append(queue.peekLast()+"\n");
				else sb.append("-1\n");
				break;
			}
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
