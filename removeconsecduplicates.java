import java.util.*;

public class removeconsecduplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char prev = ' ';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (prev == ' ' || prev != ch) {
                System.out.print(ch);
            }
            prev = ch;
        }
        sc.close();
    }
}