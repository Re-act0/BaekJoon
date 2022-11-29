import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_10253 { // 헨리

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());  // 분자
            int b = Integer.parseInt(st.nextToken());  // 분모
            int n = (b / a) + 1; // 대소 비교할 분모, 바로 빼주면 됨
            int res = n;

            while (a > 0) { // 분자가 1이 될 때까지
                if (b % a == 0) { // 만약 N분의 1 형태의 기약분수로 나타낼 수 있으면 나타냄,
                    b = b / a;
                    res = b;
                    break;
                }
                a = (a * n) - b; // 통분 했을때의 분자
                b = (b * n); // 통분 했을때의 분모

                res = n;
                n = (b / a) + 1;
            }
            bw.write(res + "\n");
        }

        bw.flush();
    }


}