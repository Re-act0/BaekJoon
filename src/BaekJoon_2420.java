import java.util.Scanner;

public class BaekJoon_2420 {  // 사파리월드

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt();
        long M = sc.nextInt();

        long sum;

        sum = N - M;

        if (N - M < 0)
            sum = -sum;

        System.out.println(sum);
        sc.close();
    }

}