import java.util.*;

public class consecutiveTwoVowels {

    static boolean isVowel(char c) {
        return ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = 0;
        String[] words = str.split("\\s+");
        for (String word : words) {
            for (int i = 0; i < word.length() - 1; i++) {
                if (isVowel(word.charAt(i)) && isVowel(word.charAt(i + 1))) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
