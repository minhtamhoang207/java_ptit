import java.util.Arrays;
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int currentTest = 1;
        while(test>0){

            int n = sc.nextInt();
            int[] a = new int[n+5];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            System.out.println("Test " + currentTest + ":");
            for(int i=0; i<n; i++){
                if(a[i]!=-100){
                    int count = 1;
                    for(int j=i+1; j<n; j++){
                        if(a[i] == a[j]){
                            a[j] = -100;
                            count++;
                        }
                    }
                    System.out.println(a[i] + " xuat hien " + count + " lan");
                }
            }

            test--;
            currentTest++;
        }
    }
}
