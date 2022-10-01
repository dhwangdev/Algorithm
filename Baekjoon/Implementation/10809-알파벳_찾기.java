import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[] abc = new char[26];
		int[] pos = new int[26];
		for (char ch='a'; ch<='z'; ch++) {
			abc[ch-'a'] = ch;
			pos[ch-'a'] = -1;
		}
		
		String word = br.readLine();
		for (int i=0; i<word.length(); i++) {
			for (int j=0; j<26; j++) {
				if (word.charAt(i)==abc[j] && pos[j]==-1) pos[j] = i;
			}
		}
		
		for (int ans: pos) {
			sb.append(ans+" ");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
