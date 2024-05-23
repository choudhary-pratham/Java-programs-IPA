import java.util.*;

public class largestWordInString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split("\\s+");
        int length = 0;
        String ans = "";
        for (String word : words) {
            if (word.length() > length) {
                length = word.length();
                ans = word;
            }
        }
        System.out.println(ans);
        sc.close();
    }

}
