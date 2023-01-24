import java.io.*;
import java.math.BigInteger;

public class BaekJoon_9655 { // 돌 게임

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        bw.write((n%2 == 1)? "SK" : "CY");
        bw.flush();
    }
}

