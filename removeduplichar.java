import java.util.*;

public class removeduplichar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> hash = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (hash.contains(str.charAt(i)) == true)
                continue;
            if (str.charAt(i) == ' ') {
                System.out.print(" ");
                continue;
            }
            System.out.print(str.charAt(i));
            hash.add(str.charAt(i));
        }
        sc.close();
    }
}
