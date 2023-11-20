import java.io.*;
import java.util.*;

public class BaekJoon_1181 { // 1181번 단어 정렬

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int x = Integer.parseInt(br.readLine());
        String[] arr1 = new String[x]; // 입력 단어 갯수 최대 20000개
        String[] arr2 = new String[2];

        for (int i = 0; i < x; i++) {
            arr1[i] = br.readLine();
        } // 단어의 개수만큼 String 배열에 삽입

        Arrays.sort(arr1, Comparator.naturalOrder()); // 오름차순으로 정렬, 남은조건 : 중복제거, 단어길이 순 정렬

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < (x - 1) - i; j++) {
                if (arr1[j].length() > arr1[j + 1].length()) {
                    arr2[0] = arr1[j]; // arr2 배열에 임시저장
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = arr2[0];
                }
            }
        } // 버블정렬 사용하여 글자 길이 순 정렬, 남은조건 : 중복제거

        // Linkedhashset 이용 해보기,

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr1));
        String[] resArr = linkedHashSet.toArray(new String[0]);

        for (int j = 0; j < resArr.length; j++) {
            bw.write(resArr[j]);
            if (j + 1 < resArr.length) {
                bw.write("\n");
            }
        }
        bw.flush();
    }

}

