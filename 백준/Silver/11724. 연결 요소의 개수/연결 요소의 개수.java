import java.util.Scanner;

public class Main {
    static int[][] nodes;
    static boolean[] visited;
    static int m;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        nodes = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            nodes[a][b] = 1;
            nodes[b][a] = 1;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    private static void dfs(int start) {
        visited[start] = true;

        for (int i = 0; i < n; i++) {
            if (nodes[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}