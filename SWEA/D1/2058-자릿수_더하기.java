import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int ans = 0;
        
        input.close();

        while (N!=0) {
            ans += N%10;
            N /= 10;
        }

        System.out.println(ans);
    }
}
