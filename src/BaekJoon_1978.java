import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1978 { // 소수 찾기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int prime_cnt = 0;

        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 31};
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int s = Integer.parseInt(st.nextToken());

            if (s <= 31) {
                for (int j = 0; j < 11; j++) {
                    if (s == arr[j]) {
                        prime_cnt++;
                    }
                }
            } else if (s > 31) {
                int cnt = 0;
                for (int j = 0; j < 11; j++) {
                    if (s % arr[j] == 0) {
                        cnt = -1;
                        break;
                    } else {
                        cnt = 1;
                    }
                }
                if (cnt == 1) {
                    prime_cnt++;
                }
            }

        }
        bw.write(prime_cnt + "");
        br.close();

        bw.flush();
        bw.close();
    }
}
