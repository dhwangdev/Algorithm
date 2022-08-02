import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] list = new int[N];
		
		for (int ite=0; ite<N; ite++) {
			list[ite] = sc.nextInt();
		}
		
		Arrays.sort(list);
		
		for (int ele : list) {
			System.out.println(ele);
		}
		
		sc.close();
	}
}

