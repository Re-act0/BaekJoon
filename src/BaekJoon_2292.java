import java.io.*;

public class BaekJoon_2292 { // 벌집
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int room = 1;
        int n=1;
        int N = Integer.parseInt(br.readLine());

        while (N>room) {
            room += (6*n);
            n++;
        }

        bw.write(n + "");

        br.close();

        bw.flush();
        bw.close();
    }
}