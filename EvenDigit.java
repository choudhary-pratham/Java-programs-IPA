import java.util.*;

public class EvenDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;

            else if (Character.isAlphabetic(ch) == true)
                consonants++;
        }
        System.out.printf("vowels count - %d\nconsonants count - %d", vowels, consonants);
        sc.close();
    }
}
