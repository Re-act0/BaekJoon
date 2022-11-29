import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon_1110 { // 더하기 사이클
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = 0; // 사이클의 횟수를 판별하게 해주는 변수
        int first_number = Integer.parseInt(br.readLine()); // 초기숫자 입력
        int f = first_number; // 초기 숫자를 f에 저장
        if (f < 10) {
            f *= 10;
            first_number = f;
        } // 만약 f가 10보다 작으면 두자리 수로 변환
        while (true) {
            int b = f / 10; // 십의 자리
            int c = f % 10; // 일의 자리
            int num; // 합의 가장 오른쪽 자리 수 저장용
            if (b + c >= 10) {
                num = (b + c) % 10;
            } // 합이 10보다 클 경우 일의자리를 가져옴
            else {
                num = b + c; // 10보다 작을 경우 b+c값 가져옴
            }
            if (c != 0) {
                f = (c * 10) + num;
            } else if (c == 0) {
                f = num;// 새로 생성된 수는 처음 숫자의 (일의 자리 *10) + 다음 생성 숫자의 일의 자리
            }
            k++; // 사이클 증가
            if (f == first_number) {
                break;
            } // 만약 초기 숫자와 새로 생성된 f가 같으면 while문 탈출
        }
        bw.write(k + "");
        br.close();

        bw.flush();
        bw.close();
    }
}