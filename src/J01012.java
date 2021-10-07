import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int n = sc.nextInt();
            int count = 1;
            if(n%2==0){
                for(int i=2; i<=n/2; i+=2){
                    if(n%i==0){
                        count++;
                    }
                }
                System.out.println(count);
            } else{
                System.out.println("0");
            }
            test--;
        }
    }
}
