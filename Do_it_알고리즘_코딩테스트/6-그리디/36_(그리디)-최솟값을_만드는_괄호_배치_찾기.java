import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // minus 기준으로 분리
        String[] minus = br.readLine().split("[-]");

        int first = 0;
        int rest = 0;

        // plus 기준으로 분리
        for (int i=0; i<minus.length; i++) {
            String[] plus = minus[i].split("[+]");

            for (int j=0; j<plus.length; j++) {
                if (i==0) first += Integer.parseInt(plus[j]);
                else rest += Integer.parseInt(plus[j]);
            }
        }

        System.out.println(first - rest);

        br.close();
    }
}
