import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_1065 { // 한수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(result(N) + "");

        br.close();

        bw.flush();
        bw.close();
    }

    public static int result(int s) {
        int res = 0;
        int il = 0;
        int sip = 0;
        int baek = 0;
        int sip_il_cha = 0;
        int baek_sip_cha = 0;

        for (int i = 1; i <= s; i++) {
            if (i < 100) {
                res++;
            } else if (i >= 100 && i < 1000) {
                il = i % 10;
                sip = (i % 100) / 10;
                baek = i / 100;

                baek_sip_cha = baek - sip;
                sip_il_cha = sip-il;

                if (sip_il_cha == baek_sip_cha) {
                    res++;
                }
            }

        }

        return res;
    }
}