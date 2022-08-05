import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		br.close();
		
		String multi = String.valueOf(A*B*C);
		char[] digit = multi.toCharArray();
		
		int[] table = new int[10];
		
		for (int idx=0; idx<digit.length; idx++) {
			int num = Integer.parseInt(String.valueOf(digit[idx]));
			table[num] += 1;
		}
		
		for (int ele : table) {
			System.out.println(ele);
		}
	}
}
