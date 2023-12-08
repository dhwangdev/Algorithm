import java.util.*;
import java.io.*;

public class Main {
    static int qnt, len;
    static String[] arr;
    static char[] letterArr;

    static class Dna {
        char letter;
        int count;

        public Dna(char letter, int count) {
            this.letter = letter;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        qnt = Integer.parseInt(st.nextToken());
        len = Integer.parseInt(st.nextToken());
        arr = new String[qnt];
        for (int i=0; i<qnt; i++) {
            arr[i] = br.readLine();
        }

        letterArr = new char[] {'A', 'C', 'G', 'T'};

        String ansDna = "";

        // 각 dna strand를 돌면서 nucleotide를 count 한다
        for (int j=0; j<len; j++) {
            // count 초기화
            Dna[] dnaArr = new Dna[4];
            for (int i=0; i<4; i++) {
                dnaArr[i] = new Dna(letterArr[i], 0);
            }

            // count 시작
            for (int i=0; i<qnt; i++) {
                for (int k=0; k<4; k++) {
                    if (arr[i].charAt(j)==dnaArr[k].letter) dnaArr[k].count++;
                }
            }

            // count 기준으로 정렬 desc, letter는 사전순 asc
            Arrays.sort(dnaArr, (Dna small, Dna big) -> {
               if (small.count==big.count) return small.letter-big.letter;
               else return big.count-small.count;
            });

            ansDna += dnaArr[0].letter;
        }

        int countDif = 0;
        for (int j=0; j<len; j++) {
            for (int i=0; i<qnt; i++) {
                if (ansDna.charAt(j)!=arr[i].charAt(j)) countDif++;
            }
        }

        System.out.println(ansDna);
        System.out.println(countDif);

        br.close();
    }
}
