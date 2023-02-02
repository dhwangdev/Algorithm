// 1. All the data in one hashmap
// 58752KB/ 600ms/ 868B

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int solve = Integer.parseInt(st.nextToken());

        HashMap<String, String> dex = new HashMap<>();
        for (int i=1; i<=total; i++) {
            String no = Integer.toString(i);
            String name = br.readLine();
            dex.put(no, name);
            dex.put(name, no);
        }

        for (int i=1; i<=solve; i++) {
            sb.append(dex.get(br.readLine()) + "\n");
        }

        System.out.println(sb.toString());

        br.close();
    }
}

// 2. Two hashmaps
// 62344KB/ 608ms/ 1242B

import java.util.*;
import java.io.*;

public class Main {

    static boolean isNum(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int solve = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> dexNo = new HashMap<>();
        HashMap<String, Integer> dexName = new HashMap<>();

        for (int i=1; i<=total; i++) {
            String name = br.readLine();
            dexNo.put(i, name);
            dexName.put(name, i);
        }

        for (int i=1; i<=solve; i++) {
            String input = br.readLine();
            if (isNum(input)) {
                sb.append(dexNo.get(Integer.parseInt(input)) + "\n");
            } else {
                sb.append(dexName.get(input) + "\n");
            }
        }

        System.out.println(sb.toString());

        br.close();
    }
}

// 3. One hasmap and one array
// 55752KB/	600ms/ 1202B

import java.util.*;
import java.io.*;

public class Main {

    static boolean isNum(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int solve = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> dex = new HashMap<>();
        String[] nameArr = new String[total+1];

        for (int i=1; i<=total; i++) {
            String name = br.readLine();
            dex.put(name, i);
            nameArr[i] = name;
        }

        for (int i=1; i<=solve; i++) {
            String input = br.readLine();
            if (isNum(input)) {
                sb.append(nameArr[Integer.parseInt(input)] + "\n");
            } else {
                sb.append(dex.get(input) + "\n");
            }
        }

        System.out.println(sb.toString());

        br.close();
    }
}
