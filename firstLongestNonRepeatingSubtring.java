import java.util.*;

public class firstLongestNonRepeatingSubtring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (mpp.containsKey(str.charAt(i)))
                break;
            mpp.put(str.charAt(i), 1);
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
