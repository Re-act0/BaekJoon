import java.io.*;

public class BaekJoon_10988 {  // 팰린드롬인지 확인하기
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int len = s.length();

        if (len == 1) {
            bw.write("1");
        }
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                bw.write("0");
                break;
            } else if (s.charAt(i) == s.charAt(len - i - 1) && (i == len / 2 - 1)) {
                bw.write("1");
            }
        }

        bw.flush();
    }

}