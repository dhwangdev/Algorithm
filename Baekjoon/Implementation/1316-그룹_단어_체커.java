import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		for (int i=0; i<N; i++) {
			char[] word = br.readLine().toCharArray();
			char[] uniqueTest = Arrays.copyOf(word, word.length);
			Arrays.sort(uniqueTest);
			int unique = 0;
			int count = 0;
			
			for (int j=1; j<word.length; j++) {
				if (word[j]!=word[j-1]) count++;
				if (uniqueTest[j]!=uniqueTest[j-1]) unique++;
			}
			
			if (count==unique) ans++; 
			
		}
		System.out.println(ans);
		
		br.close();
	}
}
