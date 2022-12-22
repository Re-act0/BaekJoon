import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_14912 {  // 숫자 빈도수
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 1 ~ n 까지의 범위 설정
        int d = Integer.parseInt(st.nextToken()); // 빈도 수를 따질 숫자 설정

        int il;
        int sip;
        int baek;
        int chon;
        int man;

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = 0; // 전체 배열을 0으로 초기화
        }

        for (int i = 1; i <= n; i++) {
            // 1 ~ 9 / 10 ~ 99 / 100 ~ 999 / 1000 ~ 9999 / 10000 ~ 99999
            if (i < 10) {
                arr[i]++;
            } else if (i >= 10 && i < 100) {
                sip = i / 10;
                il = i % 10;
                arr[sip]++;
                arr[il]++;
            } else if (i >= 100 && i < 1000) {
                baek = i / 100;
                sip = (i % 100) / 10;
                il = (i % 10);
                arr[baek]++;
                arr[sip]++;
                arr[il]++;
            } else if (i >= 1000 && i < 10000) {
                chon = i / 1000;
                baek = (i % 1000) / 100;
                sip = ((i % 1000) % 100) / 10;
                il = i % 10;
                arr[chon]++;
                arr[baek]++;
                arr[sip]++;
                arr[il]++;
            } else if (i >= 10000 && i < 100000) {
                man = i / 10000;
                chon = (i % 10000) / 1000;
                baek = ((i % 10000) % 1000) / 100;
                sip = (((i % 10000) % 1000) % 100) / 10;
                il = i % 10;
                arr[man]++;
                arr[chon]++;
                arr[baek]++;
                arr[sip]++;
                arr[il]++;
            } else { // 마지막 남은 10만
                arr[0] += 5;
                arr[1]++;
            }
        }

        bw.write(arr[d] + "");
        bw.flush();
    }

}