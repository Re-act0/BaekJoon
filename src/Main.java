import java.io.*;

public class Main { // 새로운 언어 CC

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        if (n < 0) {
            cnt += 32;
        }
        if (n == 0) {
            cnt++;
        }
        while (n >= 1) {
            n /= 2;
            cnt++;
        }

        bw.write(cnt + "");
        bw.flush();
    }

}