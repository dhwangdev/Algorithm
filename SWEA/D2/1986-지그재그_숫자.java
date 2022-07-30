import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test=0; test<T; test++) {
			int ans = 0;
			int num = sc.nextInt();
			for (int idx=1; idx<=num; idx++) {
				if (idx%2==1) {
					ans += idx;
				} else {
					ans -= idx;
				}
			}
			System.out.printf("#%d %d\n", test+1, ans);
		}
		sc.close();
		
	}
}
