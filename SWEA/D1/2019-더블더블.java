import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int exp=0; exp<=num; exp++) {
			System.out.print((int) Math.pow(2,  exp)+" ");
		}
		
		
		sc.close();
	}
}
