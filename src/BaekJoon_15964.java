import java.io.*;
import java.util.*;

public class BaekJoon_15964 { // 이상한 기호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        System.out.print((a+b) * (a-b));
    }
}