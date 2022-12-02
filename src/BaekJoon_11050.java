import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_11050 { // 이항 계수 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int N_fac = 1;
        int K_fac = 1;
        int N_K_fac = 1;
        int res;

        for (int i = 1; i <= N; i++) {
            N_fac *= i;
        }
        for (int i = 1; i <= K; i++) {
            K_fac *= i;
        }
        for (int i = 1; i <= (N - K); i++) {
            N_K_fac *= i;
        }

        res = (N_fac) / ((K_fac) * (N_K_fac));
        bw.write(res + "");

        bw.flush();
    }
}