import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		
		for (int T=1; T<=tc; T++) {
			int num = Integer.parseInt(br.readLine());
			boolean can = false;
			
			for (int a=1; a<=9; a++) {
				if (num%a==0 && num/a<10) can = true;
			}
			
			String ans = (can) ? "Yes" : "No";
			
			sb.append("#"+T+" "+ans+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
