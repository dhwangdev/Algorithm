import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int[] numDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		
		for (int test=0; test<T; test++) {
			String date = sc.nextLine();
			
			String year = date.substring(0, 4);
			String month = date.substring(4, 6);
			String day = date.substring(6, 8);
			
			if ((Integer.parseInt(month)<1 || Integer.parseInt(month)>12) || (Integer.parseInt(day)<1 || Integer.parseInt(day)>numDay[Integer.parseInt(month)-1])) {
				System.out.printf("#%d -1\n", test+1);
			} else {
				System.out.printf("#%d %s/%s/%s\n", test+1, year, month, day);
			}
		}
		sc.close();
	}
}
