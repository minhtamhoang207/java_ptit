import java.util.Scanner;

public class Dv11
{
    static boolean check(String str)
    {
        int n = str.length();

        int oddDigSum = 0, evenDigSum = 0;
        for (int i=0; i<n; i++)
        {
            if (i%2 == 0)
                oddDigSum += (str.charAt(i)-'0');
            else
                evenDigSum += (str.charAt(i)-'0');
        }

        return ((oddDigSum - evenDigSum) % 11 == 0);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String temp = sc.nextLine();
        while(test>0){
            String str = sc.nextLine();
            if(check(str))
                System.out.println("1");
            else
                System.out.println("0");
            test--;
        }
    }
}
