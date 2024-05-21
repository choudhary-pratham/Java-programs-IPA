import java.util.*;

public class countLowerCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count_lowerCase = 0, count_uppercase = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch))
                count_lowerCase++;
            else if (Character.isUpperCase(ch))
                count_uppercase++;
        }
        System.out.printf("%d %d", count_lowerCase, count_uppercase);
        sc.close();
    }
}
