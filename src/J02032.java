import java.util.Scanner;

public class J02032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int n = sc.nextInt();
            int[][] mt = new int[n+1][n+1];
            int[] a = new int[n+1];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int dem=0;
            int count = 0;
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
                for(int k=0; k<n ; k++){
                    mt[i+1][k] = a[k];
                }
                count++;
            }
            for(int i=count; i>0; i--){
                System.out.print("Buoc " + i + ":" + " " );
                for(int j=0; j<n; j++){
                    System.out.print(mt[i][j]+" ");
                }
                System.out.println();
            }
            t--;
        }
    }
}

