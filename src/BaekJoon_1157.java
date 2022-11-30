import java.io.*;

public class BaekJoon_1157 { // 단어 공부
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[26];
        int max = 0;
        int index = 0;
        int count = 0;
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        } // 배열 0으로 초기화

        String s = br.readLine().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch;
            ch = s.charAt(i);
            arr[ch - 'a'] += 1;
        } // 문자열을 받아서 각 알파벳을 카운트하여 배열에 저장

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        } // 제일 많이 카운트된 알파벳의 인덱스를 저장함

        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                count++;
            }
        } /*
         * 만약 최대값과 동일한 다른 값이 있다면 count값이 1을 초과할 것, arr[i]를 한번 돌면서 최대값 1번은 무조건 잡힘
         */

        if (count > 1) {
            bw.write("?");
        } // 중복된 값이 있는 경우 ? 출력
        else {
            char c = (char) (index + 65);
            bw.write(c);
        } // 최대값의 인덱스 "알파벳 대문자"로 출력

        br.close();

        bw.flush();
        bw.close();
    }
}
