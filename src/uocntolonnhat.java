import java.util.Scanner;

public class uocntolonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int n = sc.nextInt();
            for(int i=2; i<=Math.sqrt(n); i++){
                while(n%i==0){
                    n/=i;
                }
            }
            System.out.println(n);
            test--;
        }
    }
}
