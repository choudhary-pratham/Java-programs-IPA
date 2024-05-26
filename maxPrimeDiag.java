import java.util.*;

public class maxPrimeDiag {
    static boolean checkPrime(int num) {
        int count = 0;
        if (num == 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                count++;
        }
        if (count == 0)
            return true;
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String dimensions = sc.nextLine();
        String nums[] = dimensions.split("\\s+");
        int rows = Integer.parseInt(nums[0]), cols = Integer.parseInt(nums[1]);

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int j = 0;
            String row = sc.nextLine();
            String elements[] = row.split("\\s+");
            for (String el : elements) {
                matrix[i][j++] = Integer.parseInt(el);
            }
        }
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j || (i + j) == (rows - 1)) {
                    if (checkPrime(matrix[i][j])) {
                        ans = Math.max(ans, matrix[i][j]);
                    }
                }
            }
        }
        System.out.println();
        System.out.println(ans);
        sc.close();
    }
}
