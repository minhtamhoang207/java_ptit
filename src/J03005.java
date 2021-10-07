import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String c = sc.nextLine();
        while(test>0){
            String name = sc.nextLine();
            StringTokenizer st = new StringTokenizer(name);
            ArrayList<String> arr = new ArrayList<>();
            while (st.hasMoreTokens()) {
                String str = st.nextToken().toLowerCase();
                String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
                arr.add(cap);
            }

            for(int i=1; i<arr.size(); i++){
                System.out.print(
                        i==arr.size()-1?
                                arr.get(i):
                                arr.get(i) + " "
                );
            }
            System.out.print(", " + arr.get(0).toUpperCase());

            System.out.print("\n");
            test--;
        }
    }
}
