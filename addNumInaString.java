import java.util.*;

public class addNumInaString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        int ans = 0, num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                num = num * 10 + (arr[i] - '0');
            } else {
                ans += num;
                num = 0;
            }
        }
        ans += num;
        System.out.println(ans);
        sc.close();
    }
}