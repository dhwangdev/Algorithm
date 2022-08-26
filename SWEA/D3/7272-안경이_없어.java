import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String none = "?CEFGHIJKLMNSTUVWXYZ";
		String one = "?ADOPQR";
		String two = "?B";
		
		int tc = Integer.parseInt(br.readLine());
		for (int T=1; T<=tc; T++) {
			sb.append("#"+T+" ");
			boolean same = true;
			st = new StringTokenizer(br.readLine());
			String fir = st.nextToken();
			String sec = st.nextToken();
			
			if (fir.length()!=sec.length()) same = false;
			else {
				for (int i=0; i<fir.length(); i++) {
					if (none.indexOf(fir.charAt(i)) * none.indexOf(sec.charAt(i))<0) same = false;
					else if (one.indexOf(fir.charAt(i)) * one.indexOf(sec.charAt(i))<0) same = false;
					else if (two.indexOf(fir.charAt(i)) * two.indexOf(sec.charAt(i))<0) same = false;
				}
			}
			String ans = (same) ? "SAME":"DIFF";
			sb.append(ans+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
