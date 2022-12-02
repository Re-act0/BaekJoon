import java.io.*;
import java.util.Arrays;

public class BaekJoon_10989 { // 수 정렬하기 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] num = new int[T];
        for (int i = 0; i < T; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        for (int i = 0; i < T; i++) {
            bw.write(num[i] + "\n");
        }


        bw.flush();

    }
}