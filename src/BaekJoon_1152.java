import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1152 { // 단어의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = st.countTokens();

        bw.write(st.countTokens() + "");

        br.close();

        bw.flush();
        bw.close();
    }
}
