import java.io.*;
import java.math.BigInteger;

public class BaekJoon_10826 { // 피보나치 수 4

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        BigInteger[] dp = new BigInteger[10001];
        dp[0] = new BigInteger("0");
        dp[1] = new BigInteger("1");
        for (int i =2; i<=n; i++){
            dp[i] = dp[i-2].add(dp[i-1]); // BigInteger 연산
        }
        bw.write(dp[n]+"");
        bw.flush();
    }
}

