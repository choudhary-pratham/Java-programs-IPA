import java.util.*;

public class repeatNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) == true) {
                ch = str.charAt(i);
                continue;
            } else {
                int num = (str.charAt(i) - '0');
                while ((i + 1 < str.length()) && Character.isDigit(str.charAt(i + 1))) {
                    num = num * 10 + (str.charAt(i + 1) - '0');
                    i++;
                }
                for (int ind = 0; ind < num; ind++) {
                    ans += ch;
                }
            }
        }
        System.out.print(ans);
        sc.close();
    }
}