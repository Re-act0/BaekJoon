import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_1712 {  // 손익분기점
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int one_earn = C - B;
        int result = 0;

        if (one_earn <= 0) {
            bw.write("-1");
        } else if (one_earn > 0) {
            result = A / one_earn;
            if (A % one_earn >= 0) {
                result++;
            }
            bw.write(result + "");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}