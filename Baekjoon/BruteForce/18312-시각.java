import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String K = st.nextToken();
        
        int count = 0;
        
        for (int hr=0; hr<=N; hr++) {
        	for (int min=0; min<60; min++) {
        		for (int sec=0; sec<60; sec++) {
        			
        			String hour = String.valueOf(hr);
        			
        			if (hr<10) {
        				hour = "0" + hour;
        			} 
        			
        			
        			if (hour.contains(K)) {
        				count++;
        				continue;
        			}
        			
        			String minute = String.valueOf(min);
        			
        			if (min<10) {
        				minute = "0" + minute;
        			} 
        			
        			
        			if (minute.contains(K)) {
        				count++;
        				continue;
        			}
        			
        			String second = String.valueOf(sec);
        			
        			if (sec<10) {
        				second = "0" + second;
        			} 
        			
        			
        			if (second.contains(K)) {
        				count++;
        				continue;
        			}
        		}
        	}
        }
        
        System.out.println(count);
        
        br.close();
    }
}
