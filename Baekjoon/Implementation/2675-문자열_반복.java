import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for (int T=0; T<test; T++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int rep = Integer.parseInt(st.nextToken());
			String word = st.nextToken();
			
			for (int idx=0; idx<word.length(); idx++) {
				for (int ite=0; ite<rep; ite++) {
					System.out.print(word.charAt(idx));
				}
			}
			
			System.out.println();
		}
		
		br.close();
	}
}
