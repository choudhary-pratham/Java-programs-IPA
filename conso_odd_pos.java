import java.util.*;

public class conso_odd_pos {
    public static boolean isVowel(char ch) {
        return ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((i + 1) % 2 != 0 && isVowel(Character.toLowerCase(ch)) == false && ch != ' ')
                System.out.print(ch);
        }
        sc.close();
    }
}
