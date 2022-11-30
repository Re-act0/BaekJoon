import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1929 {  // 소수 구하기
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        prime = new boolean[N + 1];
        get_prime();


        for (int i = M; i <= N; i++) {
            // false = 소수
            if (!prime[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }

    public static void get_prime() {
        // true = 소수아님 , false = 소수
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
