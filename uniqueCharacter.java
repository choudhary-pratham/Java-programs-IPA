import java.util.*;

public class uniqueCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        HashSet<Character> hash = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (hash.contains(str.charAt(i)))
                continue;
            hash.add(str.charAt(i));
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
