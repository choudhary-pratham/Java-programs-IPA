import java.util.*;

public class missing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> mpp = new HashMap<>();
        String nums[] = sc.nextLine().split("\\s+");
        int maxi = 0;
        for (String num : nums) {
            int x = Integer.parseInt(num);
            mpp.put(x, 1);
            maxi = Math.max(maxi, x);
        }
        for (int i = 1; i <= maxi; i++) {
            if (mpp.containsKey(i) == false) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
