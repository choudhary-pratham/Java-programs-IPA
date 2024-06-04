import java.util.*;

public class count_lower_case {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i)))
                count++;
        }
        if (count == 0)
            System.out.println("No LowerCase Characters found");
        else
            System.out.println(count);
        sc.close();
    }
}
