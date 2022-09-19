import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.println(facto(N));
		
		br.close();
	} // main
	
	public static int facto(int a) {
		if (a==0 || a==1) return 1;
		else return a * facto(a-1);
	}
}
