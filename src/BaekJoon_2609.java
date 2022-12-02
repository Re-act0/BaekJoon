import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_2609 { // 최대공약수와 최소공배수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int res1 = 0;
        int res2;
        int big = Math.max(a,b);
        for (int i = 1; i <= big; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                res1 = i;
            }
        }

        if (a/res1 > b/res1){
            res2 = big * (b/res1);
        }
        else{
            res2 = big * (a/res1);
        }

        bw.write(res1+"\n");
        bw.write(res2+"\n");

        bw.flush();

    }
}