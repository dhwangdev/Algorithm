import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int weight = Integer.parseInt(br.readLine());
        int ans = -1;

        for (int numFive=weight/5; numFive>=0; numFive--) {
            if ((weight-(numFive*5))%3==0) {
                ans = numFive + (weight - (numFive*5))/3;
                break;
            }
        }

        System.out.println(ans);

        br.close();
    }
}
