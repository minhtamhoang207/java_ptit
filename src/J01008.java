import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int currentTest = 1;
        while(test>0){
            int n = sc.nextInt();
            System.out.print("Test " +  currentTest + ": ");
            for(int i=2; i<=n; i++){
                int count = 0;
                while(n%i==0){
                    n/=i;
                    count++;
                }
                if(count>0){
                    System.out.print(i+ "(" + count + ")" + " ");
                }
            }
            System.out.println();
            test--;
            currentTest++;
        }
    }
}
