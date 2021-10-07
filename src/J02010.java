import java.util.Scanner;

public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1000000];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] > a[j]){
                    a[i] += (a[j] - (a[j] = a[i]));
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
            for(int k=0; k<n; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println("\n");
        }
    }
}
