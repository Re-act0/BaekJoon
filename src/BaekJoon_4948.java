import java.io.*;

public class BaekJoon_4948 {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }
            int M = 2 * N;

            int cnt = 0;

            prime = new boolean[M + 1];
            get_prime();


            for (int i = N + 1; i <= M; i++) {
                // false = 소수

                if ((!prime[i])) {
                    cnt++;
                }

            }
            bw.write(cnt + "\n");
        }
        bw.flush();
    }

    public static void get_prime() {
        // true = 소수아님 , false = 소수
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) { // 2부터 배열의 길이의 루트만큼 검사
            if (prime[i]) continue; // 만약 prime[i] 가 true면 계속 검사 (이미 검사한 것이므로)
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true; // j = i제곱, 배열의 크기만큼 반복 / 4, 6, 8 ... 9 12 15 ...
            }
        }
    }
}