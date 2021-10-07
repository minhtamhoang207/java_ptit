import java.util.Scanner;
import java.util.Vector;

public class J02105 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        Vector <String> vt = new Vector<>();
        while(i <= n){
            StringBuilder res = new StringBuilder("List(" + i + ") = ");
            int j = 1;
            while(j <= n){
                int tmp = in.nextInt();
                if(tmp == 1) res.append(j).append(" ");
                j++;
            }
            i++;
            vt.add(res.toString());
        }
        for(int j = 0; j < vt.size(); j++){
            System.out.println(vt.elementAt(j));
        }
        in.close();
    }
}
