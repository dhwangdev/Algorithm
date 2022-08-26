import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int[] cal = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int tc = Integer.parseInt(br.readLine());
		for (int T=1; T<=tc; T++) {
			st = new StringTokenizer(br.readLine());
			int mon = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			
			int raw = day+3;
			for (int i=0; i<mon; i++) {
				raw += cal[i];
			}
			
			sb.append("#"+T+" "+raw%7+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
