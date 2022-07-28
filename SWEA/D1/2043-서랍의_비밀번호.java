import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		int K = sc.nextInt();
		
		int ans = Math.max(P,  K) - Math.min(P,  K) +1;
		
		System.out.println(ans);
		sc.close();
	}
}
