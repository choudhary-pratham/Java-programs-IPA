import java.util.*;

public class firstNonRepeatingCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> mpp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (mpp.containsKey(ch)) {
                mpp.put(ch, mpp.get(ch) + 1);
            } else {
                mpp.put(ch, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (mpp.get(ch) == 1) {
                System.out.print(ch);
                break;
            }
        }
        sc.close();
    }
}
