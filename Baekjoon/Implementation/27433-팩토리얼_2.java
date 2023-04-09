import java.io.*;

public class Main {

    static long fac(int x) {
        if (x==0) return 1;
        return x * fac(x-1);
    } // fac()
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        System.out.println(fac(num));

        br.close();
    }
}
