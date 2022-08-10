import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		while (n>0) {
			if (n%5==0) {
				count += n/5;
				break;
			}
			
			n -= 2;
			count += 1;
		}
		
		if (n<0) {
			bw.write("-1");
		} else {
			bw.write(String.valueOf(count));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
