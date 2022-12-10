import java.io.*;

public class BaekJoon_2751 {  // 수 정렬하기 2

    // 방법 1 : Collections.sort
    // 방법 2 : Counting Sort <- 여기서 사용한 방식
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[2000001]; // boolean 배열 생성

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        // 어차피 for문을 통과하면서 체크된 true값을 오름차순으로 탐색하니 출력하면 끝
        // 다만 수의 범위가 -1000000 ~ +1000000 이니, 2000000개 배열을 만든 후 탐색
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                bw.write(i-1000000 + "\n");

            }
        }


        bw.flush();
    }

}