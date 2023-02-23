import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Deque<Integer> stack = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch (st.nextToken()) {
			
			case "push":
				stack.offerLast(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop":
				if (stack.isEmpty()) sb.append("-1\n");
				else sb.append(stack.pollLast()+"\n");
				break;
				
			case "size":
				sb.append(stack.size()+"\n");
				break;
				
			case "empty":
				if (stack.isEmpty()) sb.append("1\n");
				else sb.append("0\n");
				break;
				
			case "top":
				if (stack.isEmpty()) sb.append("-1\n");
				else sb.append(stack.peekLast()+"\n");
				break;
			}
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
