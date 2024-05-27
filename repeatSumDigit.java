import java.util.Scanner;

public class repeatSumDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        while ((num / 10) > 0) {
            int sum = 0;
            while (num > 0) {
                sum += (num % 10);
                num /= 10;
            }
            num = sum;
        }
        System.out.println(num);
        sc.close();
    }
}
