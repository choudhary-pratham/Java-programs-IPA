import java.util.*;

public class maxAsciiii {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ans = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > ans) {
                ans = str.charAt(i);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
