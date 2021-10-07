import java.util.Scanner;

public class J02031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mt = new int[n+1][n+1];
        int[] a = new int[1000000];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int index=0;
        int count =1;
        for(int i=0; i<n-1; i++ ){
            index=i;
            for(int j=i+1; j<n; j++){
                if(a[j] < a[index]){
                    index=j;
                }
            }
            a[i] += (a[index] - (a[index] = a[i]));
            for(int k=0; k<n ; k++){
                mt[count][k] = a[k];
            }
            count++;
        }

        for(int i=n-1; i>0; i--){
            System.out.print("Buoc " + i + ":" + " " );
            for(int j=0; j<n; j++){
                System.out.print(mt[i][j]+" ");
            }
            System.out.println();
        }
    }
}
