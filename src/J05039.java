import java.util.Scanner;

public class J05039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc c = SoPhuc.tich(SoPhuc.tong(a,b), a);
            SoPhuc d = SoPhuc.tich(SoPhuc.tong(a,b), SoPhuc.tong(a,b));
            System.out.println(c + ", " + d);
        }
    }
}
class SoPhuc{
    static SoPhuc tong(SoPhuc s1, SoPhuc s2){
        return new SoPhuc(s1.thuc + s2.thuc, s1.ao + s2.ao);
    }

    static SoPhuc tich(SoPhuc s1, SoPhuc s2){
        return new SoPhuc(
                s1.thuc*s2.thuc - s1.ao*s2.ao,
                s1.thuc*s2.ao + s1.ao*s2.thuc
        );
    }

    int thuc;
    int ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    @Override
    public String toString() {
        return thuc + (ao<0? " - ":" + ") + Math.abs(ao) + "i";
    }
}

