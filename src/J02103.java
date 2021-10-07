import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int crTest = 1;
        while(test>0){
            int hang = sc.nextInt();
            int cot = sc.nextInt();
            int[][] a = new int[hang+1][cot+1];
            int[][] b = new int[hang+1][cot+1];
            int[][] C = new int[hang+1][cot+1];
            for(int i=0;i<hang;i++){
                for(int j=0;j<cot;j++){
                    a[i][j] = sc.nextInt();
                }
            }

            for(int i=0;i<cot;i++){
                for(int j=0;j<hang;j++){
                    b[i][j] = a[j][i];
                }
            }

            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < hang; k++) {
                        C[i][j] = C[i][j] + a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Test " + crTest + ":");
            for(int i=0;i<hang;i++){
                for(int j=0;j<cot;j++){
                    System.out.print(C[i][j] + " ") ;
                }
                System.out.println();
            }

            test--;
            crTest++;

        }
    }
}
