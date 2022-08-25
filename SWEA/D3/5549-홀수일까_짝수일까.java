import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int T=1; T<=tc; T++) {
			String num = br.readLine();

			char last = num.charAt(num.length()-1);
			
			String ans = (((int)last-(int)'0')%2==0) ? "Even": "Odd";
			
			sb.append("#"+T+" "+ans+"\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
