import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int qnt = Integer.parseInt(br.readLine());
        int sum = 0;
        char[] arr = br.readLine().toCharArray();
        for (char each: arr) {
            sum += Character.getNumericValue(each);
        }

        System.out.println(sum);

        br.close();
    }
}
