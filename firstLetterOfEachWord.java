import java.util.*;

public class firstLetterOfEachWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words[] = str.split("\\s+");
        for (String word : words) {
            System.out.print(word.charAt(0));
        }
        sc.close();
    }
}
