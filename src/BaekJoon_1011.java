import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_1011 { // Fly me to the Alpha Centauri
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int j = 0; j < N; j++) {
            int arr[] = new int[2];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 2; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int distance = arr[1] - arr[0];
            int max = (int)Math.sqrt(distance);
            if (max == Math.sqrt(distance)) {
                bw.write((2 * max -1) + "\n");
            }
            else if (distance <= max * max + max) {
                bw.write((2 * max)+"\n");
            }
            else {
                bw.write((max * 2 + 1) + "\n");
            }

        }
        br.close();

        bw.flush();
        bw.close();
    }

}
