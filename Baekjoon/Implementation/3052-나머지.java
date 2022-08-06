import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int ite=0; ite<10; ite++) {
			set.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		br.close();
		
		System.out.println(set.size());
	}
}
