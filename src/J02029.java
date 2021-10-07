import java.util.Scanner;

public class J02029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] a = new int[1000000];
            int[][] mt = new int[n+1][n+1];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    if(a[i] > a[j]){
                        a[i] += (a[j] - (a[j] = a[i]));
                    }
                }
                for(int k=0; k<n; k++){
                    mt[i+1][k] = a[k];
                }
            }

            for(int i=n-1; i>0; i--){
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
