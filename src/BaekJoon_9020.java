import java.io.*;

public class BaekJoon_9020 { // 골드바흐의 추측
    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        get_prime();

        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            int n = Integer.parseInt(br.readLine());
            int first_partition = n / 2 ;
            int second_partition = n / 2 ;

            while (true){
                // 두 파티션이 모두 소수일 경우
                if((!prime[first_partition]) && (!prime[second_partition])){
                    bw.write(first_partition + " " + second_partition + "\n");
                    break;
                }
                first_partition--;
                second_partition++;

            }
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