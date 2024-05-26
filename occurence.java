import java.util.*;

public class occurence {
    public static void main(String str[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<Character, Integer> mpp = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (mpp.containsKey(ch)) {
                    mpp.put(ch, mpp.get(ch) + 1);
                } else {
                    mpp.put(ch, 1);
                }
            }
        }
        HashSet<Character> hash = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch) && hash.contains(ch) == false) {
                System.out.printf("%c: %d\n", ch, mpp.get(ch));
            }
            hash.add(ch);
        }
        sc.close();
    }
}
