import java.util.*;

public class minasciivaluechar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (ch > str.charAt(i))
                ch = str.charAt(i);
        }
        System.out.println(ch);
        sc.close();
    }
}
