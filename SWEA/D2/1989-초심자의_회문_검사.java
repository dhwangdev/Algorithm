import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for (int test=0; test<T; test++) {
			String word = sc.nextLine();
			
			String rev = "";
			for (int letter=word.length()-1; letter>=0;letter--) {
				rev += word.charAt(letter);
			}
			
			if (word.equals(rev)) {
				System.out.printf("#%d 1\n", test+1);
			} else {
				System.out.printf("#%d 0\n", test+1);
			}
		}
		
		sc.close();
	}
}
