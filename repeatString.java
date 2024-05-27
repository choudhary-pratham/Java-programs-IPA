import java.util.*;

public class repeatString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char prevChar = str.charAt(0);
        ArrayList<String> arr = new ArrayList<>();
        String sub = "";
        sub += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if ((Character.isLetter(prevChar) && Character.isLetter(str.charAt(i)))
                    || (Character.isDigit(prevChar)) && Character.isDigit(str.charAt(i))) {
                sub += str.charAt(i);
            } else if (!Character.isDigit(str.charAt(i)) && !Character.isDigit(prevChar)
                    && !Character.isLetter(str.charAt(i)) && !Character.isLetter(prevChar)) {
                sub += str.charAt(i);
            } else {
                arr.add(sub);
                sub = "";
                sub += str.charAt(i);
            }
            prevChar = str.charAt(i);
        }
        arr.add(sub);
        System.out.println(arr.toString());
        int sum = 0;
        int count = 0;
        for (String w : arr) {
            count++;
            if (Character.isDigit(w.charAt(0)) == true) {
                sum += count;
            }
        }
        if (sum == 0)
            System.out.println(str);
        for (int i = 0; i < sum; i++)
            System.out.print(str);
        sc.close();
    }
}