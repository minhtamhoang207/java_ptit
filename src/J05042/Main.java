package J05042;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CodePTITer> codePTITers = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            String name = sc.nextLine();
            String temp = sc.nextLine();
            String[] arr = temp.split(" ");
            int ac = Integer.parseInt(arr[0]);
            int sm = Integer.parseInt(arr[1]);
            codePTITers.add(new CodePTITer(
                    name,
                    ac,
                    sm
            ));
        }
        codePTITers.sort(Comparator.comparing(CodePTITer::getAc).reversed()
                .thenComparing(i -> i.submit)
                .thenComparing(o -> o.name));

        for(CodePTITer c : codePTITers){
            System.out.println(c);
        }

    }
}

class CodePTITer{
    String name;
    int ac;
    int submit;

    public CodePTITer(String name, int ac, int submit) {
        this.name = name;
        this.ac = ac;
        this.submit = submit;
    }

    public int getAc() {
        return ac;
    }

    @Override
    public String toString() {
        return name + " " +
                ac + " " +
                submit;
    }
}
