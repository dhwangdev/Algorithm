import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int fir = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int sec = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		br.close();
		
		System.out.println(fir>sec ? fir : sec);
		
	}
}
