import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_2355 { // 시그마
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long swip = 0;
        long res = 0;

        if (A > B) {
            swip = A;
            A = B;
            B = swip;

            if (A < 0 && B < 0) {
                A = -A;
                B = -B;
                res = -((A * (A + 1) / 2) - (B * (B - 1) / 2));
            } else if (A < 0 && B >= 0) {
                A = -A;
                res = ((B * (B + 1) / 2)) - ((A * (A + 1) / 2));
            } else if (A >= 0 && B >= 0) {
                res = (B * (B + 1) / 2) - (A * (A - 1) / 2);
            }
        } else if (A < B) {
            if (A < 0 && B < 0) {
                A = -A;
                B = -B;
                res = -((A * (A + 1) / 2) - (B * (B - 1) / 2));
            } else if (A < 0 && B >= 0) {
                A = -A;
                res = (B * (B + 1) / 2) - (A * (A + 1) / 2);
            } else if (A >= 0 && B >= 0) {
                res = (B * (B + 1) / 2) - (A * (A - 1) / 2);
            }
        } else if (A == B) {
            res = A;
        }

        bw.write(res + "");

        br.close();

        bw.flush();
        bw.close();
    }
}