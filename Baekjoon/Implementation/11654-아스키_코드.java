import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int ascii = br.read();
		System.out.println(ascii);
		
		br.close();
	}
}
