import java.util.*;

public class countWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        int ans = words.length;
        System.out.println(ans);
        sc.close();
    }
}
