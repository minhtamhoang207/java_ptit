import java.util.Arrays;
import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[10000];
        int result = 0;
        Arrays.fill(a, 0);
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            result = Math.max(result, temp);
            a[temp] = temp;
        }
        boolean check = false;
        for (int i = 1; i <= result; i++)
            if (a[i] == 0) {
                check = true;
                System.out.println(i);
            }
        if (!check)
            System.out.println("Excellent!");
    }
}