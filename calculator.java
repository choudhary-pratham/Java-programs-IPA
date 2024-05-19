import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] chars = input.split("\\s+");
        int num1 = Integer.parseInt(chars[0]), num2 = Integer.parseInt(chars[1]);
        char oper = chars[2].charAt(0);
        switch (oper) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
