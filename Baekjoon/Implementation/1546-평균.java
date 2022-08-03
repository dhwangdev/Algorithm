import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double[] grade = new double[N];
		for (int idx=0; idx<N; idx++) {
			grade[idx] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(grade);
		
		double M = grade[grade.length-1];
		double sum = 0;
		
		for (int idx2=0; idx2<N; idx2++) {
			grade[idx2] = grade[idx2]/M * 100;
			sum += grade[idx2];
		}
		
		br.close();
		
		double avg = sum/grade.length;

		System.out.println(avg);
	}
}
