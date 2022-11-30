import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_2941 { // 크로아티아 알파벳
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        /*
         * 1. 2 > 1개로 줄어드는 알파벳 7개 / 2. 3 > 1개로 줄어드는 알파벳 1개
         */
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if ((i < s.length() - 1) && (s.charAt(i) == 'c') && (s.charAt(i + 1) == '=')) {
                continue;
            } else if ((i < s.length() - 1) && s.charAt(i) == 'c' && s.charAt(i + 1) == '-') {
                continue;
            } else if ((i < s.length() - 2) && (s.charAt(i) == 'd') && (s.charAt(i + 1) == 'z') && (s.charAt(i + 2) == '=')) {
                continue;
            } else if ((i < s.length() - 1) && (s.charAt(i) == 'd') && (s.charAt(i + 1) == '-')) {
                continue;
            } else if ((i < s.length() - 1) && s.charAt(i) == 'l' && s.charAt(i + 1) == 'j') {
                continue;
            } else if ((i < s.length() - 1) && s.charAt(i) == 'n' && s.charAt(i + 1) == 'j') {
                continue;
            } else if ((i < s.length() - 1) && s.charAt(i) == 's' && s.charAt(i + 1) == '=') {
                continue;
            } else if ((i < s.length() - 1) && s.charAt(i) == 'z' && s.charAt(i + 1) == '=') {
                continue;
            } else {
                count += 1;
            }
        }
        bw.write(count + "");

        br.close();

        bw.flush();
        bw.close();
    }
}
