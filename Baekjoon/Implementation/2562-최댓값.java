import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = -1;
		int nth = 0;
		for (int idx=1; idx<=9; idx++) {
			int num = Integer.parseInt(br.readLine());
			if (num>max) {
				max = num;
				nth = idx;
			}
		}
		br.close();
		
		System.out.println(max);
		System.out.println(nth);
	}
}
