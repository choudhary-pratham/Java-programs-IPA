import java.util.*;

public class RepeatChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (mpp.containsKey(ch)) {
                mpp.put(ch, mpp.get(ch) + 1);
            } else {
                mpp.put(ch, 1);
            }
        }
        // mpp.forEach((key, value) -> {
        // System.out.printf("%c - %d\n", key, value);
        // });

        for (char key : mpp.keySet()) {
            System.out.printf("%c - %d\n", key, mpp.get(key));
        }
        sc.close();
    }
}
