import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> arrList = new ArrayList<>();
        int sum = 0;
        for (int i=0; i<9; i++) {
            arrList.add(Integer.parseInt(br.readLine()));
            sum += arrList.get(i);
        }

        int surplus = sum-100;

        outer:
        for (int i=0; i<8; i++) {
            for (int j=i+1; j<9; j++) {
                if (arrList.get(i)+arrList.get(j)==surplus) {

                    int fir = arrList.get(i);
                    int sec = arrList.get(j);
                    arrList.remove(Integer.valueOf(fir));
                    arrList.remove(Integer.valueOf(sec));
                    break outer;
                }
            }
        }

        for (Integer num: arrList) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
