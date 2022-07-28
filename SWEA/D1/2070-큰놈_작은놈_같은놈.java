import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		String[] ans = new String[T];
		for (int test=0; test<T; test++) {
			int fir = sc.nextInt();
			int sec = sc.nextInt();
			
			if (fir>sec) {
				ans[test] = ">";
			} else if(fir==sec) {
				ans[test] = "=";
			} else {
				ans[test] = "<";
			}
		}
		sc.close();
		
		for (int test=0; test<T; test++) {
			System.out.printf("#%d ", test+1);
			System.out.println(ans[test]);
		}
	}

}
