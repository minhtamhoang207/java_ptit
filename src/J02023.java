import java.util.Scanner;

public class J02023 {
    static String findLargest(int m, int s) {
        if (s == 0) {
            return m == 1 ? "0" : "-1";
        }

        if (s > 9*m) {
            return "-1";
        }

        int[] res = new int[m];

        for (int i=0; i<m; i++) {
            if (s >= 9) {
                res[i] = 9;
                s -= 9;
            }

            else {
                res[i] = s;
                s = 0;
            }
        }
        String rs = "";
        for (int i=0; i<m; i++)
            rs += res[i];

        return rs;
    }
    static String findSmallest(int m, int s) {
        if (s == 0) {
            return m == 1 ? "0" : "-1";
        }
        if (s > 9*m) {
            return "-1";
        }

        int[] res = new int[m];

        s -= 1;

        for (int i=m-1; i>0; i--) {
            if (s > 9) {
                res[i] = 9;
                s -= 9;
            }
            else {
                res[i] = s;
                s = 0;
            }
        }

        String rs = "";
        res[0] = s + 1;
        for (int i=0; i<m; i++)
            rs += res[i];

        return rs;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findSmallest(s,m) + " " + findLargest(s,m));
    }
}

