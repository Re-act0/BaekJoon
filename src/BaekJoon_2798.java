import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_2798 { // 블랙잭
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] array = new int[N + 1];
        int sum;
        int max = 0;
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = array[i] + array[j] + array[k];
                    if ((max < sum) && (sum <= M)) {
                        max = sum;
                    }
                }
            }
        }

        bw.write(max + "");
        bw.flush();

    }
}