import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] input = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(input);
		System.out.println(input[N/2]);
	}
}
