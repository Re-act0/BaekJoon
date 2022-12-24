import java.io.*;
import java.math.BigDecimal;


public class BaekJoon_2052 { // 지수연산

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        BigDecimal num1 = new BigDecimal(Math.pow(2, -n));
        System.out.println(num1.toPlainString());

        bw.flush();
    }

}