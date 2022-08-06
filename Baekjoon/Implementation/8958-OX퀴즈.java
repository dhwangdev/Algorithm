import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		for (int ite=0; ite<test; ite++) {
			String line = br.readLine();
			char[] letter = line.toCharArray();
			
			int count =0;
			int ans =0;
			for (int idx=0; idx<letter.length; idx++) {
				if (letter[idx]=='O') {
					count += 1;
				}
				else {
					count = 0;
				}
				ans += count;
			}
			
			System.out.println(ans);
		}
		
		br.close();
		
	}
}
