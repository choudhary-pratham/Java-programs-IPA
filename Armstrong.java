import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int copy = num;
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum += (digit * digit * digit);
            num = num / 10;
        }
        if (newNum == copy) {
            System.out.println("YES IT IS AN ARMSTRONG NUMBER");
        } else {
            System.out.println("NO IT IS NOT AN ARMSTRONG NUMBER");
        }
        sc.close();
    }
}
