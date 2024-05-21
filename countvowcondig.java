import java.util.*;

public class countvowcondig {
    static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count_vowels = 0, count_consonants = 0, count_digit = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            if (Character.isDigit(ch) == true) {
                count_digit++;
            } else if (isVowel(ch) == true) {
                count_vowels++;
            } else
                count_consonants++;
        }
        System.out.printf("%d %d %d", count_vowels, count_consonants, count_digit);
        sc.close();
    }
}
