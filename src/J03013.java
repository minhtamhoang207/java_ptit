import java.util.*;

public class J03013 {

    static boolean isSmaller(String str1, String str2) {
        int n1 = str1.length(), n2 = str2.length();
        if (n1 < n2)
            return true;
        if (n2 < n1)
            return false;

        for (int i = 0; i < n1; i++)
            if (str1.charAt(i) < str2.charAt(i))
                return true;
            else if (str1.charAt(i) > str2.charAt(i))
                return false;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            if (isSmaller(str1, str2)) {
                String t = str1;
                str1 = str2;
                str2 = t;
            }

            StringBuilder str = new StringBuilder();

            int n1 = str1.length(), n2 = str2.length();

            str1 = new StringBuilder(str1).reverse().toString();
            str2 = new StringBuilder(str2).reverse().toString();

            int carry = 0;

            for (int i = 0; i < n2; i++) {
                int sub
                        = (str1.charAt(i) - '0'
                        - (str2.charAt(i) - '0') - carry);

                if (sub < 0) {
                    sub = sub + 10;
                    carry = 1;
                }
                else
                    carry = 0;

                str.append((char) (sub + '0'));
            }

            for (int i = n2; i < n1; i++) {
                int sub = (str1.charAt(i) - '0' - carry);

                if (sub < 0) {
                    sub = sub + 10;
                    carry = 1;
                }
                else
                    carry = 0;

                str.append((char) (sub + '0'));
            }
            System.out.println(new StringBuilder(str.toString()).reverse());
        }
    }
}