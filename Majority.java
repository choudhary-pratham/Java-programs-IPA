import java.util.*;

public class Majority {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int num : arr) {
            if (mpp.containsKey(num)) {
                mpp.put(num, mpp.get(num) + 1);
            } else {
                mpp.put(num, 1);
            }
        }
        System.out.println();
        for (int key : mpp.keySet()) {
            if (mpp.get(key) > (n / 2)) {
                System.out.println(key);
                break;
            }
        }
        sc.close();
    }
}
