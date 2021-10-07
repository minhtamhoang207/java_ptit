import java.util.*;

public class mangdoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            System.out.println(solve()?"YES":"NO");
            test--;
        }
    }

    static Boolean solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            arr.add(temp);
        }

        for(int i=0; i<arr.size()/2; i++){
            if(!arr.get(i).equals(arr.get(n-i-1))){
                return false;
            }
        }
        return true;
    }
}
