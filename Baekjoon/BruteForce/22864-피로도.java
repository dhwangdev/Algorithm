import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int fatigue = 0;
        int work = 0;
        
        for (int i=0; i<24; i++) {
        	if (fatigue+A<=M) {
        		fatigue += A;
        		work += B;
        	} else {
        		fatigue -= C;
        		if (fatigue<0) fatigue = 0;
        	}
        }
        
        System.out.println(work);
        
        br.close();
    }
}
