import java.util.*;

public class find_uppercase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words[] = str.split("\\s+");
        int ans = 0;
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0)) == true) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
