import java.io.*;

public class Main {

    static int fib(int x) {
        if (x==0) return 0;
        if (x==1) return 1;
        return fib(x-1) + fib(x-2);
    } // fib()
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        System.out.println(fib(num));

        br.close();
    }
}
