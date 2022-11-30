import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_2581 { // 소수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int S = M;
        int count = 0;
        int min = 0;
        int sum = 0;
        int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
        // 최대 체크 97, 25개

        for (int i = 0; i < (N - M + 1); i++) { // M이상 N이하 자연수의 개수는 M-N+1개 이므로
            if (S <= 97) {
                Loop1: for (int j = 0; j < 25; j++) {
                    if (S == arr[j]) {
                        sum += S;
                        count++;
                        if (count == 1) {
                            min = S;
                        }
                        break Loop1;
                    }
                }
            } else if (S > 97) {
                int cnt = 0;
                for (int j = 0; j < 25; j++) {
                    if (S % arr[j] == 0) {
                        cnt++;
                    }
                    if (j == 24 && cnt == 0) {
                        sum += S;
                        count++;
                        if (count == 1) {
                            min = S;
                        }
                    }
                }
            }
            S++;
        }
        if (sum == 0) {
            bw.write("-1");
        } else {
            bw.write(sum + "\n");
            bw.write(min+"");

        }

        br.close();

        bw.flush();
        bw.close();
    }
}
