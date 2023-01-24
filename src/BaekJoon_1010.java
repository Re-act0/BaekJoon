import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1010 { // 다리 놓기
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            dp = new int[n + 1][m + 1];
            res(n, m);
            bw.write(dp[n][m]+"\n");

        }
        bw.flush();
    }
    static int res(int n, int m) {
        if (n == m) {
            dp[n][m] = 1;
        }
        if (n == 1) {
            dp[n][m] = m;
        }
        if (n == 0) dp[n][m] = 0;
        if (dp[n][m] > 0) return dp[n][m];
        if (n > 1) {
            for (int i = n - 1; i < m; i++) {
                dp[n][m] += res(n - 1, i);
            }
        }
        return dp[n][m];
    }
}

