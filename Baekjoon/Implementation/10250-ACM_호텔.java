import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for (int ite=0; ite<test; ite++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int floor;
			int room;
			
			if (N%H==0) {
				floor = H;
				room = N/H;
			} else {
				floor = N%H;
				room = N/H+1;
			}
			
			System.out.printf("%d%02d\n", floor, room);
		}
		
		br.close();
	}
}
