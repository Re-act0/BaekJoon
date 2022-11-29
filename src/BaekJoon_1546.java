import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_1546 { // 평균
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        double pt = 0;
        int N = Integer.parseInt(st.nextToken());
        double arr[] = new double[N + 1];
        double sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
            if (arr[i] > pt) {
                pt = arr[i];
            }
        }
        for (int j = 0; j < N; j++) {
            arr[j] = (arr[j] / pt) * 100;
            sum += arr[j];
        }
        bw.write(sum / N + "");
        br.close();

        bw.flush();
        bw.close();
    }
}