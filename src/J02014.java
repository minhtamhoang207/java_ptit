import java.util.Scanner;

public class J02014 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            t--;
            int sum = 0;
            boolean check = false;
            int n = sc.nextInt();
            int[] a = new int[n+5];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum+=a[i];
            }
            int temp = 0;
            for(int i = 0; i < n; i++){
                temp+=a[i];
                if(temp == (sum-a[i+1])/2){
                    System.out.println(i+2);
                    check = true;
                    break;
                }
            }
            if (!check) System.out.println(-1);
        }
    }
}
