import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            res.add(a[i]);
            Collections.sort(res);
            System.out.print("Buoc " + i + ": ");
            for(int j = 0; j < res.size(); j++){
                System.out.print(res.get(j) + " ");
            }
            System.out.print("\n");
        }
    }
}
