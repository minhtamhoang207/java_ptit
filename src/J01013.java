import java.util.Scanner;

public class J01013 {
    static Scanner input = new Scanner(System.in);
    static boolean NguyenTo[];
    static int n, Max ,arr[] , res[];
    public static void main(String[] args) {
        n = input.nextInt();
        Max = Integer.MIN_VALUE;
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            if(arr[i] > Max) Max = arr[i];
        }
        NguyenTo = new boolean[Max+1];
        res = new int [Max +1];
        solve();
        input.close();
    }
    public static void SangNguyenTo(){
        for(int i = 2; i <= Max; i++) NguyenTo[i] = true;
        for(int i = 2; i <= Max; i++){
            if(NguyenTo[i]){
                res[i] = i;
                for(int j = 2*i; j <= Max; j+=i){
                    NguyenTo[j] = false;
                    int tmp = j;
                    while(tmp % i == 0){
                        res[j] += i;
                        tmp /= i;
                    }
                }
            }
        }
    }
    public static void solve(){
        SangNguyenTo();
        long result = 0;
        for(int i = 0; i < n; i++){
            result += res[arr[i]];
        }
        System.out.println(result);
    }
}