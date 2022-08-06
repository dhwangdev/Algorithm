import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String strNum = br.readLine();
		char[] digitList = strNum.toCharArray();
		
		int sum = 0 ;
		for (int idx=0; idx<N; idx++) {
			int digit = Integer.parseInt(String.valueOf(digitList[idx]));
			sum += digit;
		}
		
		br.close();
		
		System.out.println(sum);
	}
}
