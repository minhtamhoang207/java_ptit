import java.util.Scanner;

public class J02015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n+5];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int count = 0;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    if(a[i] + a[j] ==k){
                        count++;
                    }
                }
            }
            System.out.println(count);

            test--;
        }
    }
}
