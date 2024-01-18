import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder revBinary = new StringBuilder();

        //input
        int num = Integer.parseInt(br.readLine());

        // add 1 and convert to binary
        num = num+1;
        while (num>1) {
            revBinary.append(num%2);
            num/=2;
        }

        // 첫 자리수 빼고 4, 7로 변환
        StringBuilder ans = new StringBuilder();
        for (int i=revBinary.toString().length()-1; i>=0; i--) {
            if (revBinary.toString().charAt(i)=='0') ans.append(4);
            else ans.append(7);
        }

        System.out.println(ans);

        br.close();
    }
}
