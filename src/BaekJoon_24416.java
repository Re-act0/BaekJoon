import java.io.*;

public class BaekJoon_24416 { // 알고리즘 수업 - 피보나치 수 1
    public static int fibonacci(int n) {
        int[] fibos = new int[n+1];
        fibos[1]=fibos[2]=1;
        for(int i=3;i<=n;i++) {
            fibos[i]=fibos[i-1]+fibos[i-2];
        }
        return fibos[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());

        bw.append(fibonacci(n)+" "+(n-2));
        //코드 1은 1을 더한 횟수임으로 피보나치수와 동일
        //코드 2는 3~n만큼 반복이므로 n-2만큼 실행
        bw.flush();
    }
}

