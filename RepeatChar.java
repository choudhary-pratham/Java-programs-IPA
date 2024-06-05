import java.util.*;

public class RepeatChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        char prev = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == prev) {
                count++;
            } else {
                System.out.printf("%c%d", prev, count);
                count = 1;
            }
            prev = ch;
        }
        System.out.printf("%c%d", prev, count);
        sc.close();
    }
}
