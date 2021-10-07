import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[][] mt = new int[n+1][n+1];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            res.add(a[i]);
            Collections.sort(res);
            for(int j = 0; j < res.size(); j++){
                mt[i][j] = res.get(j);
            }
        }

        for(int i=n-1; i>=0; i--){
            System.out.print("Buoc " + i + ":" + " " );
            for(int j=0; j<n; j++){
                System.out.print(mt[i][j]+" ");
            }
            n--;
            System.out.println();
        }
    }
}
