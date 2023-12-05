import java.io.*;

public class Main {
    static int node;
    static char[][] tree;
    static StringBuilder sb = new StringBuilder();

    static void preOrder(char abc) {
        if (abc=='.') return;

        // root-left-right
        sb.append(abc);
        preOrder(tree[abc-'A'][0]);
        preOrder(tree[abc-'A'][1]);
    }

    static void inOrder(char abc) {
        if (abc=='.') return;

        // left-root-right
        inOrder(tree[abc-'A'][0]);
        sb.append(abc);
        inOrder(tree[abc-'A'][1]);
    }

    static void postOrder(char abc) {
        if (abc=='.') return;

        // left-right-root
        postOrder(tree[abc-'A'][0]);
        postOrder(tree[abc-'A'][1]);
        sb.append(abc);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());
        tree = new char[26][2];
        for (int i=0; i<node; i++) {
            String[] temp = br.readLine().split(" ");
            int idx = temp[0].charAt(0) - 'A';
            char left = temp[1].charAt(0);
            char right = temp[2].charAt(0);

            tree[idx][0] = left;
            tree[idx][1] = right;
        }

        preOrder('A');
        sb.append("\n");
        inOrder('A');
        sb.append("\n");
        postOrder('A');
        sb.append("\n");

        System.out.println(sb);

        br.close();
    }
}
