import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int dem=0;
        for(int i=0; i<n-1; i++){
            dem=0;
            for (int j=0; j<n-i-1; j++){
                if(a[j] > a[j+1]){
                    a[j] += (a[j+1] - (a[j+1] = a[j]));
                    dem++;
                }
            }
            if(dem==0){
                break;
            }
            System.out.print("Buoc " + (i+1) + ": ");
            for(int k=0; k<n ; k++){
                System.out.print(a[k] + " ");
            }
            System.out.print("\n");
        }
    }
}
