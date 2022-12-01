import java.io.*;
import java.math.BigInteger;

public class BaekJoon_15829 { //
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String S = br.readLine();
        BigInteger sum = new BigInteger("0");

        for (int i = 0; i < S.length(); i++) {
            sum = sum.add(BigInteger.valueOf(S.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
        }

        bw.write(sum.remainder(BigInteger.valueOf(1234567891))+"");
        bw.flush();

    }
}