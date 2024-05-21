import java.util.*;

public class prime {
    static int isPrime(int n) {
        int count = 0;
        if (n == 1)
            return 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0)
            return 1;
        else
            return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int ans = 0;
        while (n > 0) {
            ans += isPrime(n % 10);
            n /= 10;
        }
        System.out.println(ans);
        sc.close();
    }
}
