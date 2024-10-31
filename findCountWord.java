import java.util.*;

public class findCountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String searchWord = sc.nextLine();
        int count = 0;
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) == false) {
                if (word.equals(searchWord))
                    count++;
                word = "";
            } else {
                word += ch;
            }
        }
        if (word.equals(searchWord))
            count++;
        System.out.println(count);
        sc.close();
    }
}
