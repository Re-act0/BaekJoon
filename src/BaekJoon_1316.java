import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_1316 { // 그룹 단어 체커
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 단어의 갯수 입혁받음
        int cnt = 0; // 루프에서 빠져나온 카운트 세기
        char ch;

        for (int i = 0; i < N; i++) { // N회 루프
            String s = br.readLine();
            if (s.length() > 2) {
                loop:
                for (int j = 0; j < s.length(); j++) {
                    for (int k = j + 2; k < s.length(); k++) {
                        if ((s.charAt(j) == s.charAt(k)) && !(s.charAt(j) == s.charAt(j + 1))) {
                            cnt += 1;
                            break loop; /*
                             * 한번 이 단어가 그룹 단어이 아님을 확인 카운트를 늘리고 loop: 하위 반복문을 빠져나옴
                             */
                        }
                    }
                }
            }
        }
        cnt = N - cnt; // 그룹 단어 = 전체 횟수 - 그룹 단어가 아니었던 횟수
        bw.write(cnt + "");

        br.close();

        bw.flush();
        bw.close();
    }
}