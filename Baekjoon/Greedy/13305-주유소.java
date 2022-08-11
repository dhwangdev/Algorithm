import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int city = Integer.parseInt(br.readLine());
		
		StringTokenizer kmln = new StringTokenizer(br.readLine());
		long[] km = new long[city-1];
		for (int idx=0; idx<km.length; idx++) {
			km[idx] = Long.parseLong(kmln.nextToken());
		}
		
		StringTokenizer costln = new StringTokenizer(br.readLine());
		long[] cost = new long[city];
		for (int idx=0; idx<cost.length; idx++) {
			cost[idx] = Long.parseLong(costln.nextToken());
		}
		
		long pay = cost[0];
		long sum = 0;
		for (int idx=0; idx<km.length; idx++) {
			if (cost[idx] < pay) {
				pay = cost[idx];
			}
			sum += km[idx] * pay;
		}
		br.close();
		
		System.out.println(sum);
	}
}
