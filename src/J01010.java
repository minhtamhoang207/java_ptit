import java.math.BigInteger;
import java.util.Scanner;

public class J01010 {
    static String sliceHalf(String c){
        switch (c){
            case "0":
            case "8":
            case "9":
                return "0";
            case "1": return "1";
            default: return "INVALID";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            String num = sc.nextLine();
            String rs = "";
            boolean flag = false;
            for(char s : num.toCharArray()){
                if(sliceHalf(String.valueOf(s)).equals("INVALID")){
                    System.out.println("INVALID");
                    flag = true;
                    break;
                } else{
                    rs+=sliceHalf(String.valueOf(s));
                }
            }
            if(!flag){
                BigInteger temp = BigInteger.valueOf(Long.parseLong(rs));
                System.out.println(
                        temp.compareTo(BigInteger.valueOf(0)) > 0 ?
                                BigInteger.valueOf(Long.parseLong(rs)):
                                "INVALID"
                );
            }
        }
    }
}
