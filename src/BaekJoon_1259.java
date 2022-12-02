import java.io.*;

public class BaekJoon_1259 { // 팰린드롬수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int T = Integer.parseInt(br.readLine());
            if (T == 0) {
                break;
            }
            String s = Integer.toString(T);
            int index = s.length();
            int cnt = 0;

            for (int i = 0; i < index / 2; i++) {
                if (s.charAt(i) == s.charAt(index - 1 - i)) {
                    cnt++;
                }

            }
            if (cnt == (index / 2)) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }

        }

        bw.flush();

    }
}