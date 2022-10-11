import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		char[] abc = new char[26];
		for (char ch = 'a'; ch<='z'; ch++) {
			abc[ch-'a'] = ch;
		}
		
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			char[] line = br.readLine().toCharArray();
			int count = 0;
			boolean start = false;
			int ite = 0;
			
			for (int i=0; i<line.length; i++) {
				if (line[i]=='a') start = true;
				
				if (start && line[i]==abc[ite]) count++;
				else if (start && line[i]!=abc[ite]) break;
				
				ite++;
			}
			
			sb.append("#"+tc+" "+count+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
