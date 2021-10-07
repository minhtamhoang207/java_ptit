import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
            System.out.print("Buoc " + count + ": ");
            a[i] += (a[index] - (a[index] = a[i]));
            for(int k=0; k<n ; k++){
                System.out.print(a[k] + " ");
            }
            count++;
            System.out.println("\n");
        }
    }
}
