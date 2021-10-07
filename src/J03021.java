import java.util.Scanner;

public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String str = sc.nextLine();
            StringBuilder num = new StringBuilder();
            for(int i = 0; i<str.length(); i++){
                String temp = String.valueOf(str.charAt(i)).toLowerCase();
                if("abc".contains(temp)){
                    num.append("2");
                } else if ("def".contains(temp)){
                    num.append("3");
                } else if ("ghi".contains(temp)){
                    num.append("4");
                } else if ("jkl".contains(temp)){
                    num.append("5");
                } else if ("mno".contains(temp)){
                    num.append("6");
                } else if ("pqrs".contains(temp)){
                    num.append("7");
                } else if ("tuv".contains(temp)){
                    num.append("8");
                } else if ("wxyz".contains(temp)){
                    num.append("9");
                }
            }
            String copyOfNum = num.toString();
            String mun = num.reverse().toString();
            if(copyOfNum.equals(mun)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
