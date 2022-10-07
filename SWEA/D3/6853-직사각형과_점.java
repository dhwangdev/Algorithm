import java.io.*;
import java.util.*;

public class Solution {
	static int x1, y1, x2, y2, in, side, out;
	
	static void in(int a, int b) {
		if (a>x1 && a<x2 && b>y1 && b<y2) in++;
	}
	
	static void side(int a, int b) {
		if ((a==x1 && b>=y1 && b<=y2) || (a==x2 && b>=y1 && b<=y2) || (b==y1 && a>=x1 && a<=x2) || (b==y2 && a>=x1 && a<=x2) ) {
			side++;
		}
	}
	
	static void out(int a, int b) {
		if (a<x1 || a>x2 || b<y1 ||b>y2) out++;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			
			in = 0;
			side = 0;
			out = 0;
			int N = Integer.parseInt(br.readLine());
			for (int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				int px = Integer.parseInt(st.nextToken());
				int py = Integer.parseInt(st.nextToken());
				
				in(px, py);
				side(px, py);
				out(px, py);
			}
			sb.append("#"+tc+" "+in+" "+side+" "+out+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
