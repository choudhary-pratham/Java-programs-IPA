import java.util.*;

public class mergeTwoString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == ',') {
                System.out.print(", ");
            } else {
                System.out.print(ch);
            }
        }
        System.out.print(", ");
        for (int i = 0; i < str2.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == ',') {
                System.out.print(", ");
            } else {
                System.out.print(ch);
            }
        }
        System.out.println();
        sc.close();
    }
}
