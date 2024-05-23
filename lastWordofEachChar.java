import java.util.*;

public class lastWordofEachChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String words[] = line.split("\\s+");
        for (String word : words) {
            int length = word.length();
            System.out.print(word.charAt(length - 1));
        }
        System.out.println();
        sc.close();
    }
}
