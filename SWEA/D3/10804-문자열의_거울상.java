import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		for (int T=1; T<=tc; T++) {
			sb.append("#"+T+" ");
			String line = br.readLine();
			for (int i=line.length()-1; i>=0; i--) {
				switch (line.charAt(i)) {
				case 'b':
					sb.append('d');
					break;
				case 'd':
					sb.append('b');
					break;
				case 'p':
					sb.append('q');
					break;
				case 'q':
					sb.append('p');
					break;
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
