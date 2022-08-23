import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		while (N>0) {
			if (N%5==0) {
				count += N/5;
				break;
			} else {
				count += 1;
				N -= 3;
			}
		}
		
		if (N>=0) System.out.println(count);
		else System.out.println(-1);
		
		br.close();
	}
}
