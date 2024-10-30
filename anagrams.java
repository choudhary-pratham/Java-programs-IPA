import java.util.*;

public class anagrams {
    static String sortString(String s) {
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        return new String(sArr);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), t = sc.nextLine();
        s = sortString(s);
        t = sortString(t);
        if (s.equals(t))
            System.out.println("true");
        else
            System.out.println("false");
        sc.close();
    }
}
