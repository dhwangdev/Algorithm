import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int A = input[0];
		int B = input[1];
		
		if (A+B ==4) {
			if (A<B) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		} else {
			if (A<B) {
				System.out.println("B");
			} else {
				System.out.println("A");
			}
		}
		
		
	}
}
