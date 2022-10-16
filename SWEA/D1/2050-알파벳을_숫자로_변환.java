import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		char[] line = br.readLine().toCharArray();
		for (int i=0; i<line.length; i++) {
			sb.append(line[i]-'A'+1).append(" ");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
