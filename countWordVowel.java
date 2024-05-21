import java.util.*;

public class countWordVowel {
    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (isVowel(word.charAt(0))) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
