import java.util.Scanner;

public class J02020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int check=0;
        int count = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i=1; i<=k; i++){
            arr[i]=i;
        }
        do {
            for (int i=1; i<=k; i++) {
                System.out.print(arr[i]);
            }
            count++;
            System.out.print(" ");
            int i=k;
            while (i>0 && arr[i]==n-k+i) i--;
            if (i>0) {
                arr[i]++;
                for (int j=i+1; j<=k; j++) {
                    arr[j]=arr[i]+j-i;
                }
            } else check=1;
        }
        while (check!=1);
        System.out.println();
        System.out.println("Tong cong co " + count + " to hop");
    }
}