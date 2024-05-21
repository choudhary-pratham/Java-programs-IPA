import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sc.close();
        int a = 0, b = 1;
        System.out.printf("%d %d ", a, b);

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.printf("%d ", c);
        }
        System.out.println();
    }
}
