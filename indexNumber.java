import java.util.*;

public class indexNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        // int ind = str.indexOf(ch);
        int ind = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == (ch)) {
                ind = i;
                break;
            }
        }
        if (ind == -1)
            System.out.println("NA");
        else
            System.out.println(ind);
        sc.close();
    }
}
