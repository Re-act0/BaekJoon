import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1193 { // 분수찾기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int X = Integer.parseInt(br.readLine());

        int n = 1;
        int sum = n;

        while (sum < X) {
            n++;
            sum += n;
        }
        if (n % 2 == 1) {
            int s = 1;
            while (sum > X) {
                sum--;
                s++;
                n--;
            }
            bw.write(s + "/" + n);
        } else if (n % 2 == 0) {
            int s = 1;
            while (sum > X) {
                sum--;
                s++;
                n--;
            }
            bw.write(n + "/" + s);
        }

        br.close();

        bw.flush();
        bw.close();
    }
}