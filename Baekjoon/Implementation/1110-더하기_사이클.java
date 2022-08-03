import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int num = N;
		int count = 0;
		
		do {
			num = (num%10)*10 + (num/10 + num%10)%10;
			count += 1;
		} while (num!=N);
		
		System.out.println(count);
	}
}
