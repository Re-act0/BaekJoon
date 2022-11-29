import java.io.*;

public class BaekJoon_11653 { // 소인수분해
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        int i = 2;

        while (n > 1) { // n이 1이 되기 전까지 반복
            if (n % i == 0) { // 만약 2로 나누어 지면 출력 후 한번 더 반복
                n = (n / i); // n을 나눈 몫을 다시 n에 저장
                bw.write(i + "\n"); // 현재 나눈 i를 출력
            } else if (n % i != 0) { // 만약 나누어 떨어지지 않으면 i를 증가시킴
                i++;
            }
        }

        bw.flush();
    }
}

