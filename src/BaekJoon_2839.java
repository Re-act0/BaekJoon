import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_2839 { // 설탕 배달
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int cnt_5 = 0;
        int cnt_3 = 0;


        if (N % 5 == 0) {
            cnt_5 += N / 5;
            bw.write(cnt_5 + "");
        } // 5의 배수 거름망 {3,4,6,7,8,9,11,12...} 남아나옴

        else if ((N % 5 != 0)) {
            while (N >= 3) {
                N -= 3;
                cnt_3++;
                if (N % 5 == 0) {
                    cnt_5 += N / 5;
                    bw.write(cnt_3 + cnt_5 + "");
                    break;
                } else if (N == 0) {
                    bw.write(cnt_5 + cnt_3 + "");
                    break;
                } else if (N == 1) {
                    bw.write("-1");
                }
            }
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
