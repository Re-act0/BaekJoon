import java.io.*;

public class BaekJoon_2231 { // 분해합

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int res = 0;
        int a = Integer.parseInt(br.readLine()); // a를 입력받는다

        for (int i = 0; i < a; i++) {
            String s = Integer.toString(i);
            res = i;
            for (int j = 0; j < s.length(); j++) {
                res += Character.getNumericValue(s.charAt(j));
            }
            if (res == a) {
                bw.write(i + "");
                break;
            } else if ((i == a - 1) && (res != a)) {
                bw.write("0");
            }
        }


        bw.flush();
    }

}
