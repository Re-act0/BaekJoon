import java.io.*;

public class BaekJoon_2748 { // 피보나치 수 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());

        long res = 1;
        long f1 = 0;
        long f2 = 1;

        for (int i=1; i<n; i++){
            res = f1 + f2;
            f1 = f2;
            f2 = res;
        }

        bw.write(res+"");
        bw.flush();
    }
}

