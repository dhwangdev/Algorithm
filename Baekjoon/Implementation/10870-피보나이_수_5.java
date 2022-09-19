import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibo(n));
		
		br.close();
	} // main
	
	public static int fibo(int a) {
		if (a==0) return 0;
		else if (a==1) return 1;
		else return fibo(a-1) + fibo(a-2);
	}
}
