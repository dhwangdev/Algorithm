import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int T=1; T<=tc; T++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int people = Integer.parseInt(st1.nextToken());
			int sec = Integer.parseInt(st1.nextToken());
			int bread = Integer.parseInt(st1.nextToken());
			
			int[] arrive = new int[people];
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int i=0; i<people; i++) {
				arrive[i] = Integer.parseInt(st2.nextToken());
			} // 입력 완료
			
			Arrays.sort(arrive);
			
			boolean can = true;
			for (int idx=0; idx<arrive.length; idx++) {
				int total = (arrive[idx]/sec)*bread-idx;
				if (total<=0) {
					can = false;
					break;
				}
			}

      String ans = (can==true) ? "Possible" : "Impossible";
      System.out.printf("#%d %s\n", T, ans);
			
		} // 모든 케이스 종료
		
		br.close();
	} // main
}
